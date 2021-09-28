import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            //init the scanner and print out the optinos
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose from the following options:");
            System.out.println("A or a:  To display the divisors of a natural number");
            System.out.println("B or b: To display the multiplication table for a natural number");
            System.out.println("Q or q to Exit\n");
            System.out.println("Enter your choice: ");
            String option = scanner.nextLine().toLowerCase();
            //if option = q stop the program
            if (option.equals("q")) {
                System.out.println("Bye! Thank you for playing!");
                return;
            }

            int currDivisor;
            switch(option) { //switch on the option selected
                case "a":
                    //get the number
                    System.out.println("Enter your number: ");
                    int number = scanner.nextInt();

                    if (number < 1) {
                        System.out.println(number + " is not a natural number.");
                    } else {
                        //set up the loop
                        currDivisor = 2;
                        ArrayList<Integer> divisors = new ArrayList();
                        divisors.add(1);

                        do {
                            if (number % currDivisor == 0) { //if there isn't a remainder added it to the arrayList
                                divisors.add(currDivisor);
                            }
                            ++currDivisor;

                        } while(currDivisor <= number); //stop when currDivisor == number

                        if (divisors.size() == 2) { //case that it is a prime number
                            System.out.println(number + " is prime (the only divisors of " + number + " are 1 and " + number + ")");
                        } else {
                            System.out.println("the divisors of " + number + " are: " + divisors);
                        }
                    }
                    System.out.println();
                    break;
                case "b":
                    System.out.println("Enter your number: ");
                    int num = scanner.nextInt();
                    if (num < 1) { //check to see if it is a natural number
                        System.out.println(num + " is not a natural number.");
                        break;
                    } else { //loop from 1 to the size of the multiplication table while displaying output
                        System.out.println("Enter the size of the multiplication table (1,2..etc):");
                        currDivisor = scanner.nextInt();
                        int i = 1;

                        while(i < currDivisor + 1) {
                            System.out.println(num + " x " + i + " = " + num * i);
                            ++i;
                        }
                    }
                    System.out.println();
                    break;

                default: //input was not one of the options provided
                    System.out.println("Input invalid");
            }
        }
    }
}
