//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Student student1 = null;
//        Student student2 = null;
//        Faculty faculty1 = null;
//        Staff staff1 = null;
//        int option;
//
//        do {
//            option = Menu.getChoice();
//            switch (option) {
//                case 1:
//                    faculty1 = Faculty.createFaculty();
//                    System.out.println("Faculty successfully added!\n");
//                    break;
//
//                case 2:
//                    if (student1 != null) {
//                        System.out.println("You already have two students filled in. Do you want to update their information?");
//                        System.out.print("Yes or No:");
//                        String yesOrNo = new Scanner(System.in).nextLine();
//                        if (!yesOrNo.equals("Yes")) {
//                            if (!yesOrNo.equals("No")) {
//                                System.out.println("Invalid Entry");
//                            }
//                            break;
//                        }
//                    }
//                    student1 = Student.createStudent();
//                    student2 = Student.createStudent();
//                    System.out.println();
//                    break;
//
//                case 3:
//                    //check if students exists
//                    if (student1 == null) {
//                        System.out.println("Sorry! No Students entered yet\n");
//                        break;
//                    }
//                    System.out.println("Which student? 1 " + student1.getName() + " or 2 " + student2.getName() + "?");
//                    int response = (new Scanner(System.in)).nextInt();
//                    if (response == 1) student1.generateInvoice();
//                    else student2.generateInvoice();
//                    break;
//
//                case 4:
//                    if (faculty1 == null) {
//                        System.out.println("Sorry! No Faculty member entered yet");
//                        break;
//                    }
//                    System.out.println(faculty1);
//                    break;
//
//                case 5:
//                    staff1 = Staff.createStaff();
//                    break;
//
//                case 6:
//                    if (staff1 == null) {
//                        System.out.println("Sorry! No Staff member entered yet");
//                        break;
//                    }
//                    System.out.println(staff1);
//                    break;
//
//                case 7:
//                    System.out.print("Goodbye!");
//                    break;
//
//                default:
//                    System.out.println("Invalid entry - please try again");
//                    break;
//            }
//        } while (option != 7);
//
//
//    }
//}
//
//import java.util.Scanner;
//
//public class Faculty extends Person {
//
//    private Departments department;
//    private Rank rank;
//
//    public Faculty() {
//        this.department = null;
//        this.rank = null;
//    }
//
//    public Faculty(String name, String id, Departments department, Rank rank) {
//        super(name, id);
//        this.department = department;
//        this.rank = rank;
//    }
//
//    public Departments getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Departments department) {
//        this.department = department;
//    }
//
//    public Rank getRank() {
//        return rank;
//    }
//
//    public void setRank(Rank rank) {
//        this.rank = rank;
//    }
//
//    public static Faculty createFaculty() {
//        var scanner = new Scanner(System.in);
//        System.out.println("Enter faculty info:");
//        System.out.print("Name of the faculty: ");
//        String name = scanner.nextLine();
//
//        System.out.print("ID: ");
////        scanner = new Scanner(System.in);
//        String ID = scanner.nextLine();
//        scanner = new Scanner(System.in);
//
//        System.out.print("Rank:");
//        Rank rank = Menu.getRank();
//
//        System.out.print("Department: ");
//        Departments department = Menu.getDepartment();
//
//        return new Faculty("Gianmarco", ID, department, rank);
//    }
//
//    @Override
//    public String toString() {
//        return "--------------------------\n " + getName() + "\t " + getId() + "\n" +
//                getDepartment() + ", " + getRank() + "\n--------------------------\n";
//    }
//}
//import java.util.Scanner;
//
//public class Staff extends Person {
//    private Departments department;
//    private Status status;
//
//    public Staff() {
//        this.department = null;
//        this.status = null;
//    }
//    public Staff(String name, String id, Departments department, Status status) {
//        super(name, id);
//        this.department = department;
//        this.status = status;
//    }
//
//    public static Staff createStaff() {
//        var scanner = new Scanner(System.in);
//        System.out.println("Enter Staff info:");
//        System.out.print("Name of the staff member: ");
//        String name = scanner.nextLine();
//
//        System.out.print("ID: ");
////        scanner = new Scanner(System.in);
//        String ID = scanner.nextLine();
//
//        System.out.print("Department: ");
//        Departments department = Menu.getDepartment();
//
//        System.out.print("Status, Enter P for Part Time or Enter F for Full Time: ");
//        Status status = Menu.getStatus();
//
//        return new Staff("Gianmarco", ID, department, status);
//    }
//
//
//    public Departments getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Departments department) {
//        this.department = department;
//    }
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }
//
//    @Override
//    public String toString() {
//        return "--------------------------\n " + getName() + "\t " + getId() + "\n" +
//                getDepartment() + ", " + getStatus() + "\n--------------------------\n";
//    }
//}
//public class Person {
//    private String name;
//    private String id;
//
//    public Person() {
//        this.id = "";
//        this.name = "";
//    }
//
//    public Person(String name, String id) {
//        this.id = id;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "name='" + name + '\'' +
//                ", id=" + id + ", ";
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//}
//import java.util.Arrays;
//        import java.util.Scanner;
//
//public class Menu {
//
//    public static int getChoice() {
//        System.out.println("1- Enter the information of the faculty member");
//        System.out.println("2- Enter the information of the two students");
//        System.out.println("3- Print tuition invoice ");
//        System.out.println("4- Print faculty information");
//        System.out.println("5- Enter the information of the staff member");
//        System.out.println("6- Print the information of the staff member");
//        System.out.println("7- Exit Program");
//
//        System.out.println("Enter your selection");
//        String option = new Scanner(System.in).nextLine();
//        int num;
//        try {
//            num = Integer.parseInt(option);
//        } catch (Exception e) {
//            System.out.println("Invalid Entry, please try again \n");
//            return getChoice();
//        }
//        return num;
//    }
//
//    public static Rank getRank() {
//        var scanner = new Scanner(System.in);
//        String rank = scanner.nextLine();
//        if (!rank.equals("Professor") && !rank.equals("Adjunct")) {
//            System.out.println(rank + " is invalid");
//            System.out.print("Rank: ");
//            return getRank();
//        }
//        if (rank.equals("Professor")) {
//            return Rank.Professor;
//        }
//        return Rank.Adjunct;
//    }
//
//    public static Departments getDepartment() {
//        var scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String department = input.toLowerCase();
//
//        if (department.equals("mathematics")) return Departments.Mathematics;
//
//        if (department.equals("engineering")) return Departments.Engineering;
//
//        if (department.equals("english")) return Departments.English;
//
//        System.out.println(input + " is invalid");
//        System.out.print("Department: ");
//        return getDepartment();
//    }
//
//    public static Status getStatus() {
//        var scanner = new Scanner(System.in);
//        char status = scanner.nextLine().charAt(0);
//        if (status == 'P') return Status.PartTime;
//        if (status == 'F') return Status.FullTime;
//        System.out.println("Invalid input, please try again!");
//        return getStatus();
//    }
//}
//import java.util.Scanner;
//
//public class Student extends Person {
//    private Double GPA;
//    private int creditHours;
//    static double paymentPerCreditHour = 236.45;
//    static double administrativeFee = 52;
//
//    public Student() {
//        super();
//        this.GPA = -1.0;
//        this.creditHours = -1;
//    }
//
//    public Student(String name, String id, Double GPA, int creditHours) {
//        super(name, id);
//        this.creditHours = creditHours;
//        this.GPA = GPA;
//    }
//
//    public Double getGPA() {
//        return GPA;
//    }
//
//    public void setGPA(Double GPA) {
//        this.GPA = GPA;
//    }
//
//    public int getCreditHours() {
//        return creditHours;
//    }
//
//    public void setCreditHours(int creditHours) {
//        this.creditHours = creditHours;
//    }
//
//    public static Student createStudent() {
//        var scanner = new Scanner(System.in);
//        System.out.println("Enter Student info:");
//        System.out.print("Name of the Student: ");
//        String name = scanner.nextLine();
//
//        System.out.print("ID: ");
//        scanner = new Scanner(System.in);
//        String ID = scanner.nextLine();
//
//        scanner = new Scanner(System.in);
//        System.out.print("GPA:");
//        double GPA = scanner.nextDouble();
//
//        System.out.print("Credit hours: ");
//        int creditHours = scanner.nextInt();
//
//        System.out.println("Thanks");
//
//        return new Student(name, ID, GPA, creditHours);
//    }
//
//    public void generateInvoice() {
////        pay $236.45 per credit hour in addition to a $52 administrative fee.
////        Your code should generate a tuition invoice. Note that students get
////        a 15% off total payment if their gpa is greater or equal to 3.85.
//        System.out.println("----------------------------------------------");
//        System.out.println(this.getName() + "\t" + this.getId());
//        System.out.println("Credit Hours: " + this.creditHours + " ($" + paymentPerCreditHour + "/credit hour)");
//        System.out.println("Fee: $" + administrativeFee + "\n");
//        double payment = (paymentPerCreditHour * creditHours) + administrativeFee;
//        double discount = 0;
//        if (GPA >= 3.85) {
//            discount = payment * 0.15;
//            payment -= discount;
//        }
//        System.out.printf("Total payment (after discount): $%,.2f \t (%,.2f discount applied)\n", payment, discount);
//        System.out.println("----------------------------------------------");
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                super.toString() +
//                "GPA=" + GPA +
//                ", creditHours=" + creditHours +
//                '}';
//    }
//}
//
//public enum Departments {
//    Mathematics, Engineering, English
//}
//
//public enum Rank {
//    Professor, Adjunct
//}
//public enum Status {
//    PartTime, FullTime
//}