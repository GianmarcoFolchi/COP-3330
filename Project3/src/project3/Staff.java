package project3;

import java.util.Scanner;

public class Staff extends Employee {
    private Departments department;
    private Status status;

    //Constructors
    public Staff() {
        this.department = null;
        this.status = null;
    }
    public Staff(String name, String id, Departments department, Status status) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.status = status;
    }

    //Getters and Setters
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

    //Methods

    @Override
    public void print() {
        System.out.println("--------------------------\n " +
                getName() + "\t " + getId() + "\n" +
                getDepartment() + ", " + getStatus() +
                "\n--------------------------\n");
    }

    public static Staff createStaff() {
        var scanner = new Scanner(System.in);
        System.out.println("Enter staff info:");
        System.out.print("Name of the staff member: ");
        String name = scanner.nextLine();

        System.out.print("ID: ");
        scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        try {
            if (!PersonDB.isValidID(id)) {
                throw new IdException();
            }
        } catch (IdException e) {
            System.out.println(e.getMessage());
            return createStaff();
        }

        System.out.print("Department: ");
        Departments department = Menu.getDepartment();

        System.out.print("Enter P for Part Time or Enter F for Full Time: ");
        Status status = Menu.getStatus();

        return new Staff(name, id, department, status);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + department + ", " + status;
    }

}
