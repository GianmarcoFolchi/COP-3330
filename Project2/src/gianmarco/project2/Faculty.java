package gianmarco.project2;

import java.util.Scanner;

public class Faculty extends Person {

    private Departments department;
    private Rank rank;

    public Faculty() {
        this.department = null;
        this.rank = null;
    }

    public Faculty(String name, String id, Departments department, Rank rank) {
        super(name, id);
        this.department = department;
        this.rank = rank;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public static Faculty createFaculty() {
        var scanner = new Scanner(System.in);
        System.out.println("Enter faculty info:");
        System.out.print("Name of the faculty: ");
        String name = scanner.nextLine();

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Project2.Rank:");
        Rank rank = Menu.getRank();

        System.out.print("Department: ");
        Departments department = Menu.getDepartment();

        return new Faculty(name, id, department, rank);
    }

    @Override
    public String toString() {
        return "--------------------------\n " + getName() + "\t " + getId() + "\n" +
                getDepartment() + ", " + getRank() + "\n--------------------------\n";
    }
}

