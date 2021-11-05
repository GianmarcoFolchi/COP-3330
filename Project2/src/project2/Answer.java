//package project2;
//
//import java.util.Scanner;
//
//public enum Departments {
//    MATHEMATICS, ENGINEERING, ENGLISH
//}
//public abstract class Employee extends Person {
//    Departments department;
//}
//
//public class Faculty extends Employee {
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
//        this.name = name;
//        this.id = id;
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
//        String id = scanner.nextLine();
//
//        System.out.print("Rank:");
//        Rank rank = Menu.getRank();
//
//        System.out.print("Department: ");
//        Departments department = Menu.getDepartment();
//
//        return new Faculty(name, id, department, rank);
//    }
//
//    @Override
//    public void print() {
//
//        System.out.println("--------------------------\n " + getName() + "\t " + getId() + "\n" +
//                getDepartment() + ", " + getRank() + "\n--------------------------\n");
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//
//        int option;
//
//        do {
//            option = Menu.getChoice();
//            switch (option) {
//                case 1:
//                    PersonDB.setPersonList(Faculty.createFaculty());
//                    System.out.println("Faculty successfully added!\n");
//                    break;
//
//                case 2:
//                    PersonDB.setPersonList(Student.createStudent());
//                    System.out.println();
//                    break;
//
//                case 3:
//                    //check if students exists
//                    Person student = PersonDB.findByID(Menu.getID(Student.class), Student.class);
//                    if (student == null) {
//                        System.out.println("No Student Matched");
//                        break;
//                    }
//
//                    student.print();
//                    break;
//
//                case 4:
//                    Person faculty = PersonDB.findByID(Menu.getID(Faculty.class), Faculty.class);
//                    if (faculty == null) {
//                        System.out.println("No Faculty Matched");
//                        break;
//                    }
//
//                    faculty.print();
//                    break;
//
//                case 5:
//                    PersonDB.setPersonList(Staff.createStaff());
//                    System.out.println("Staff successfully added!\n");
//                    break;
//
//                case 6:
//                    Person staff = PersonDB.findByID(Menu.getID(Staff.class), Staff.class);
//                    if (staff == null) {
//                        System.out.println("No Staff Matched");
//                        break;
//                    }
//
//                    staff.print();
//                    break;
//
//                case 7:
//                    System.out.print("Goodbye!");
//                    break;
//
//                case 8:
//                    PersonDB.printAll();
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
//public class Menu {
//
//    private Menu() {
//        throw new IllegalStateException("Utility Class");
//    }
//
//    public static String getID(Class neededClass) {
//        if (neededClass.equals(Student.class)) {
//            System.out.println("Enter the Student ID: ");
//            return new Scanner(System.in).nextLine();
//        }
//
//        if (neededClass.equals(Faculty.class)) {
//            System.out.println("Enter the Faculty ID: ");
//            return new Scanner(System.in).nextLine();
//        }
//
//        if (neededClass.equals(Staff.class)) {
//            System.out.println("Enter the Staff ID: ");
//            return new Scanner(System.in).nextLine();
//        }
//        return "";
//    }
//
//    public static int getChoice() {
//        System.out.println("1- Enter the information of a faculty member");
//        System.out.println("2- Enter the information of a student");
//        System.out.println("3- Print tuition invoice for a student");
//        System.out.println("4- Print the information for a faculty member");
//        System.out.println("5- Enter the information of a staff member");
//        System.out.println("6- Print the information of a staff member");
//        System.out.println("7- Exit Program");
//        System.out.println("8- Print the information of all stored in the Database");
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
//            System.out.print("Project2.Rank: ");
//            return getRank();
//        }
//        if (rank.equals("Professor")) {
//            return Rank.PROFESSOR;
//        }
//        return Rank.ADJUNCT;
//    }
//
//    public static Departments getDepartment() {
//        var scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String department = input.toLowerCase();
//
//        if (department.equals("mathematics")) return Departments.MATHEMATICS;
//
//        if (department.equals("engineering")) return Departments.ENGINEERING;
//
//        if (department.equals("english")) return Departments.ENGLISH;
//
//        System.out.println(input + " is invalid");
//        System.out.print("Department: ");
//        return getDepartment();
//    }
//
//    public static Status getStatus() {
//        var scanner = new Scanner(System.in);
//        char status = scanner.nextLine().charAt(0);
//        if (status == 'P') return Status.PART_TIME;
//        if (status == 'F') return Status.FULL_TIME;
//        System.out.println("Invalid input, please try again!");
//        return getStatus();
//    }
//}
//
//public class PersonDB {
//    static int personListCap = 10;
//    static Person[] personList = new Person[personListCap];
//    static int personListSize = 0;
//
//    public static Person[] getPersonList() {
//        return personList;
//    }
//
//    public static void setPersonList(Person person) {
//        if (personListSize == personListCap) {
//            personListCap += 25;
//            Person[] temp = new Person[personListCap];
//            System.arraycopy(personList, 0, temp, 0, personListSize);
//            personList = temp;
//        }
//        personList[personListSize] = person;
//        personListSize++;
//    }
//
//    public static Person findByID(String id, Class neededClass) {
//        for (Person person: personList) {
//            if (person == null) continue;
//            if (person.getClass().equals(neededClass) && person.id.equals(id)) return person;
//        }
//        return null;
//    }
//
//    public static void printAll() {
//        if (personListSize == 0) System.out.println("No one stored in the database");
//        for (Person person: personList) {
//            if (person == null) continue;
//            person.print();
//        }
//    }
//}
//
//abstract class Person {
//    protected String name;
//    protected String id;
//
//    protected Person() {
//        this.id = "";
//        this.name = "";
//    }
//
//    protected Person(String name, String id) {
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
//
//    public abstract void print();
//}
//
//public enum Rank {
//    PROFESSOR, ADJUNCT
//}
//
//public class Staff extends Employee {
//    private Departments department;
//    private Status status;
//
//    //Constructors
//    public Staff() {
//        this.department = null;
//        this.status = null;
//    }
//    public Staff(String name, String id, Departments department, Status status) {
//        this.name = name;
//        this.id = id;
//        this.department = department;
//        this.status = status;
//    }
//
//    //Getters and Setters
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
//    //Methods
//
//    @Override
//    public void print() {
//        System.out.println("--------------------------\n " +
//                getName() + "\t " + getId() + "\n" +
//                getDepartment() + ", " + getStatus() +
//                "\n--------------------------\n");
//    }
//
//    public static Staff createStaff() {
//        var scanner = new Scanner(System.in);
//        System.out.println("Enter staff info:");
//        System.out.print("Name of the staff member: ");
//        String name = scanner.nextLine();
//
//        System.out.print("ID: ");
//        scanner = new Scanner(System.in);
//        String id = scanner.nextLine();
//
//        System.out.print("Department: ");
//        Departments department = Menu.getDepartment();
//
//        System.out.print("Enter P for Part Time or Enter F for Full Time: ");
//        Status status = Menu.getStatus();
//
//        return new Staff(name, id, department, status);
//    }
//
//}
//
//public enum Status {
//    PART_TIME, FULL_TIME
//}
//
//public class Student extends Person {
//    private Double gpa;
//    private int creditHours;
//    static double paymentPerCreditHour = 236.45;
//    static double administrativeFee = 52;
//
//    //Constructors
//    public Student() {
//        super();
//        this.gpa = -1.0;
//        this.creditHours = -1;
//    }
//
//    public Student(String name, String id, Double gpa, int creditHours) {
//        super(name, id);
//        this.creditHours = creditHours;
//        this.gpa = gpa;
//    }
//
//    //Getters and Setters
//    public Double getGpa() {
//        return gpa;
//    }
//
//    public void setGpa(Double gpa) {
//        this.gpa = gpa;
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
//
//    //methods
//    @Override
//    public String toString() {
//        return "{" +
//                super.toString() +
//                "GPA=" + gpa +
//                ", creditHours=" + creditHours +
//                '}';
//    }
//
//    @Override
//    public void print() {
//        System.out.println("----------------------------------------------");
//        System.out.println(this.getName() + "\t" + this.getId());
//        System.out.println("Credit Hours: " + this.creditHours + " ($" + paymentPerCreditHour + "/credit hour)");
//        System.out.println("Fee: $" + administrativeFee + "\n");
//        double payment = (paymentPerCreditHour * creditHours) + administrativeFee;
//        double discount = 0;
//        if (gpa >= 3.85) {
//            discount = payment * 0.15;
//            payment -= discount;
//        }
//        System.out.printf("Total payment (after discount): $%,.2f \t (%,.2f discount applied)%n", payment, discount);
//        System.out.println("----------------------------------------------");
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
//        String id = scanner.nextLine();
//
//        scanner = new Scanner(System.in);
//        System.out.print("GPA:");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Credit hours: ");
//        int creditHours = scanner.nextInt();
//
//        System.out.println("Thanks");
//
//        return new Student(name, id, gpa, creditHours);
//    }
//}