import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public static int getChoice() {
        System.out.println("1- Enter the information of the faculty member");
        System.out.println("2- Enter the information of the two students");
        System.out.println("3- Print tuition invoice ");
        System.out.println("4- Print faculty information");
        System.out.println("5- Enter the information of the staff member");
        System.out.println("6- Print the information of the staff member");
        System.out.println("7- Exit Program");

        System.out.println("Enter your selection");
        String option = new Scanner(System.in).nextLine();
        int num;
        try {
            num = Integer.parseInt(option);
        } catch (Exception e) {
            System.out.println("Invalid Entry, please try again \n");
            return getChoice();
        }
        return num;
    }

    public static Rank getRank() {
        var scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        if (!rank.equals("Professor") && !rank.equals("Adjunct")) {
            System.out.println(rank + " is invalid");
            System.out.print("Rank: ");
            return getRank();
        }
        if (rank.equals("Professor")) {
            return Rank.Professor;
        }
        return Rank.Adjunct;
    }

    public static Departments getDepartment() {
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String department = input.toLowerCase();

        if (department.equals("mathematics")) return Departments.Mathematics;

        if (department.equals("engineering")) return Departments.Engineering;

        if (department.equals("english")) return Departments.English;

        System.out.println(input + " is invalid");
        System.out.print("Department: ");
        return getDepartment();
    }

    public static Status getStatus() {
        var scanner = new Scanner(System.in);
        char status = scanner.nextLine().charAt(0);
        if (status == 'P') return Status.PartTime;
        if (status == 'F') return Status.FullTime;
        System.out.println("Invalid input, please try again!");
        return getStatus();
    }


}
