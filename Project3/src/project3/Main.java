package project3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option;

        do {
            option = Menu.getChoice();
            switch (option) {
                case 1:
                    PersonDB.setPersonList(Faculty.createFaculty());
                    System.out.println("Faculty successfully added!\n");
                    break;

                case 2:
                    PersonDB.setPersonList(Student.createStudent());
                    System.out.println();
                    break;

                case 3:
                    //check if students exists
                    Person student = PersonDB.findByID(Menu.getID(Student.class), Student.class);
                    if (student == null) {
                        System.out.println("No Student Matched");
                        break;
                    }

                    student.print();
                    break;

                case 4:
                    Person faculty = PersonDB.findByID(Menu.getID(Faculty.class), Faculty.class);
                    if (faculty == null) {
                        System.out.println("No Faculty Matched");
                        break;
                    }

                    faculty.print();
                    break;

                case 5:
                    PersonDB.setPersonList(Staff.createStaff());
                    System.out.println("Staff successfully added!\n");
                    break;

                case 6:
                    Person staff = PersonDB.findByID(Menu.getID(Staff.class), Staff.class);
                    if (staff == null) {
                        System.out.println("No Staff Matched");
                        break;
                    }

                    staff.print();
                    break;

                case 7:
                    System.out.println("Would you like to create a text report? (Y/N): ");
                    Scanner scanner = new Scanner(System.in);
                    String answer = scanner.nextLine();
                    if (answer.equals("Y")) {
                        //send the text report
                        PersonDB.createTextReport();
                    } else {
                        System.out.print("Goodbye!");
                    }

                    break;

                default:
                    System.out.println("Invalid entry - please try again");
                    break;
            }
        } while (option != 7);


    }
}
