package project3;

import java.util.Scanner;

public class Menu {

    private Menu() {
            throw new IllegalStateException("Utility Class");
        }

    public static String getID(Class neededClass) {
        if (neededClass.equals(Student.class)) {
            System.out.println("Enter the Student ID: ");
            return new Scanner(System.in).nextLine();
        }

        if (neededClass.equals(Faculty.class)) {
            System.out.println("Enter the Faculty ID: ");
            return new Scanner(System.in).nextLine();
        }

        if (neededClass.equals(Staff.class)) {
            System.out.println("Enter the Staff ID: ");
            return new Scanner(System.in).nextLine();
        }
        return "";
    }

    public static int getChoice() {
        System.out.println("1- Enter the information of a faculty member");
        System.out.println("2- Enter the information of a student");
        System.out.println("3- Print tuition invoice for a student");
        System.out.println("4- Print the information for a faculty member");
        System.out.println("5- Enter the information of a staff member");
        System.out.println("6- Print the information of a staff member");
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
            System.out.print("Project2.Rank: ");
            return getRank();
        }
        if (rank.equals("Professor")) {
            return Rank.PROFESSOR;
        }
        return Rank.ADJUNCT;
    }

    public static Departments getDepartment() {
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String department = input.toLowerCase();

        if (department.equals("mathematics")) return Departments.MATHEMATICS;

        if (department.equals("engineering")) return Departments.ENGINEERING;

        if (department.equals("english")) return Departments.ENGLISH;

        System.out.println(input + " is invalid");
        System.out.print("Department: ");
        return getDepartment();
    }

    public static Status getStatus() {
        var scanner = new Scanner(System.in);
        char status = scanner.nextLine().charAt(0);
        if (status == 'P') return Status.PART_TIME;
        if (status == 'F') return Status.FULL_TIME;
        System.out.println("Invalid input, please try again!");
        return getStatus();
    }
}