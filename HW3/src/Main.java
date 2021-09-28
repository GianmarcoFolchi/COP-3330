import java.util.Scanner;

public class Main {

    private static boolean insert(String[] names, String name) {
        for (int i = 0; i < 5; i++) {
            if (names[i] == null) {
                names[i] = name;
                return true;
            }
        }
        return false;
    }

    private static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Menu myMenu = new Menu();
        String[] names = new String[5];
        names = myMenu.getNames();
        if (names == null)
            return;
        char option;

        do {
            System.out.println("Do you want to make a change to any of the entered names (enter y/Y for yes or e/E to Exit program):");
            var scanner = new Scanner(System.in);
            option = scanner.nextLine().toLowerCase().charAt(0);

            switch (option) {
                case 'y':
                    System.out.println("Enter the name you would like to change: ");
                    String name = scanner.nextLine();
                    int index = -1;
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null) {
                            if (names[i].equals(name))
                                index = i;
                        }
                    }

                    if (index == -1) {
                        System.out.println("Sorry no such name in your list. Would you like to add " + name + " to the list? enter y/Y for yes or n/N for no ");
                        scanner = new Scanner(System.in);
                        if (scanner.nextLine().toLowerCase().equals("y")) {
                            if (insert(names, name)) printArr(names);
                            else System.out.println("Sorry, you can't add a new name as you already have 5 names!");
                        }
                    } else {
                        System.out.println("Enter the new name: ");
                        names[index] = scanner.nextLine();
                        System.out.println("Got it! Here is the new list: ");
                        printArr(names);
                    }
                    break;
                case 'e':
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice...Try again");
                    break;
            }

        } while (option != 'e');
    }


}
