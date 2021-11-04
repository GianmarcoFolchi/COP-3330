package gianmarco.project2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = null;
        Student student2 = null;
        Faculty faculty1 = null;
        Staff staff1 = null;
        int option;

        do {
            option = Menu.getChoice();
            switch (option) {
                case 1:
                    faculty1 = Faculty.createFaculty();
                    System.out.println("Project2.Faculty successfully added!\n");
                    break;

                case 2:
                    if (student1 != null) {
                        System.out.println("You already have two students filled in. Do you want to update their information?");
                        System.out.print("Yes or No:");
                        String yesOrNo = new Scanner(System.in).nextLine();
                        if (!yesOrNo.equals("Yes")) {
                            if (!yesOrNo.equals("No")) {
                                System.out.println("Invalid Entry");
                            }
                            break;
                        }
                    }
                    student1 = Student.createStudent();
                    student2 = Student.createStudent();
                    System.out.println();
                    break;

                case 3:
                    //check if students exists
                    if (student1 == null) {
                        System.out.println("Sorry! No Students entered yet\n");
                        break;
                    }
                    System.out.println("Which student? 1 " + student1.getName() + " or 2 " + student2.getName() + "?");
                    int response = (new Scanner(System.in)).nextInt();
                    if (response == 1) student1.generateInvoice();
                    else student2.generateInvoice();
                    break;

                case 4:
                    if (faculty1 == null) {
                        System.out.println("Sorry! No Project2.Faculty member entered yet");
                        break;
                    }
                    System.out.println(faculty1);
                    break;

                case 5:
                    staff1 = Staff.createStaff();
                    break;

                case 6:
                    if (staff1 == null) {
                        System.out.println("Sorry! No Project2.Staff member entered yet");
                        break;
                    }
                    System.out.println(staff1);
                    break;

                case 7:
                    System.out.print("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid entry - please try again");
                    break;
            }
        } while (option != 7);


    }
}




