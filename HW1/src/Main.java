import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double TAX = 6.0D;
        System.out.println("Enter the Employee’s full name:");
        String fullName = myScanner.nextLine();
        System.out.println("Enter the Employee’s number:");
        String number = myScanner.nextLine();
        System.out.println("Enter the pay rate per hour:");
        double payRate = myScanner.nextDouble();
        System.out.println("Enter the regular hours worked:");
        double hoursWorked = myScanner.nextDouble();
        double grossPay = payRate * hoursWorked;
        double deductions = grossPay * 0.06D;
        double netPay = grossPay - deductions;
        System.out.println("\nEmployee's name: " + fullName);
        System.out.println("Employee's number: " + number);
        System.out.println("Hourly rate of pay: " + payRate);
        System.out.println("Hours worked: " + hoursWorked + "\n");
        System.out.printf("Total Gross Pay: $%.2f \n", grossPay);
        System.out.printf("Tax(%.0f%%): $%,.2f \n", 6.0D, deductions);
        System.out.println("Deductions");
        System.out.printf("Net Pay: %,.2f Dollars", netPay);
    }
}

