import java.util.Scanner;

public class Menu {

    public String[] getNames() {
        //-1 to exit and negative
        System.out.println("Enter how many name(s) you have: ");
        var scanner = new Scanner(System.in);
        int numNames = scanner.nextInt();
        scanner = new Scanner(System.in);
        if (numNames == -1)
            return null;

        if (numNames > 5 || numNames < 0) {
            System.out.println("Sorry, you can't have more than 5 names stored in our system! Enter -1 to exit this program.");
            return getNames();
        }

        System.out.println("Enter your " + numNames + " seperated by * the hit the Enter Key: ");
        String name = scanner.nextLine();
        String[] namesArr = new String[5];
        var temp = name.split("\\*");
        System.arraycopy(name.split("\\*"), 0, namesArr, 0, name.split("\\*").length);

        for (int i = 0; i < numNames; i++) namesArr[i] = namesArr[i].strip();

        System.out.println("You entered: ");

        for (int i = 0; i < namesArr.length; i++) {
            if (namesArr[i] != null)
                System.out.print(namesArr[i] + " ");
        }
        System.out.println();
        return namesArr;
    }
}
