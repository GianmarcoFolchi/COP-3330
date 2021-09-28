import java.util.Scanner;

public class Menu {
    public char getChoice() {
        System.out.println("l/L: List all employees");
        System.out.println("h/H: Hire a new employee");
        System.out.println("f/F: Fire a new employee");
        System.out.println("q/Q: Exit");
        System.out.println("Enter your selection");

        char option = new Scanner(System.in).nextLine().charAt(0);
        option = Character.toLowerCase(option);
        return option;
    }
}
