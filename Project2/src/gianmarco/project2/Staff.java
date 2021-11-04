package gianmarco.project2;

import java.util.Scanner;

public class Staff extends Person {
    private Departments department;
    private Status status;

    public Staff() {
        this.department = null;
        this.status = null;
    }
    public Staff(String name, String id, Departments department, Status status) {
        super(name, id);
        this.department = department;
        this.status = status;
    }

    public static Staff createStaff() {
        var scanner = new Scanner(System.in);
        System.out.println("Enter Project2.Staff info:");
        System.out.print("Name of the staff member: ");
        String name = scanner.nextLine();

        System.out.print("ID: ");
        scanner = new Scanner(System.in);
        String id = scanner.nextLine();

        System.out.print("Department: ");
        Departments department = Menu.getDepartment();

        System.out.print("Project2.Status, Enter P for Part Time or Enter F for Full Time: ");
        Status status = Menu.getStatus();

        return new Staff(name, id, department, status);
    }


    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "--------------------------\n " + getName() + "\t " + getId() + "\n" +
                getDepartment() + ", " + getStatus() + "\n--------------------------\n";
    }
}
