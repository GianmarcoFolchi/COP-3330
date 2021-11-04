package project2;

import java.util.Scanner;

public class Student extends Person {
    private Double gpa;
    private int creditHours;
    static double paymentPerCreditHour = 236.45;
    static double administrativeFee = 52;

    //Constructors
    public Student() {
        super();
        this.gpa = -1.0;
        this.creditHours = -1;
    }

    public Student(String name, String id, Double gpa, int creditHours) {
        super(name, id);
        this.creditHours = creditHours;
        this.gpa = gpa;
    }

    //Getters and Setters
    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }


    //methods
    @Override
    public String toString() {
        return "{" +
                super.toString() +
                "GPA=" + gpa +
                ", creditHours=" + creditHours +
                '}';
    }

    @Override
    public void print() {
        System.out.println("----------------------------------------------");
        System.out.println(this.getName() + "\t" + this.getId());
        System.out.println("Credit Hours: " + this.creditHours + " ($" + paymentPerCreditHour + "/credit hour)");
        System.out.println("Fee: $" + administrativeFee + "\n");
        double payment = (paymentPerCreditHour * creditHours) + administrativeFee;
        double discount = 0;
        if (gpa >= 3.85) {
            discount = payment * 0.15;
            payment -= discount;
        }
        System.out.printf("Total payment (after discount): $%,.2f \t (%,.2f discount applied)%n", payment, discount);
        System.out.println("----------------------------------------------");
    }

    public static Student createStudent() {
        var scanner = new Scanner(System.in);
        System.out.println("Enter Student info:");
        System.out.print("Name of the Student: ");
        String name = scanner.nextLine();

        System.out.print("ID: ");
        scanner = new Scanner(System.in);
        String id = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.print("GPA:");
        double gpa = scanner.nextDouble();

        System.out.print("Credit hours: ");
        int creditHours = scanner.nextInt();

        System.out.println("Thanks");

        return new Student(name, id, gpa, creditHours);
    }
}