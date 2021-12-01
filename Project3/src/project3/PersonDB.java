package project3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersonDB {
    private PersonDB() {
        throw new IllegalStateException("Utility class");
    }

    static ArrayList<Person> personList = new ArrayList<>();

    public static ArrayList<Person> getPersonList() {
        return personList;
    }

    public static void setPersonList(Person person) {

        if (findByID(person.getId(), person.getClass()) == null) {
            personList.add(person);
        } else {
            //TODO send the exception
            System.out.println("Person with that ID Already Exists");
        }
    }

    public static boolean isValidID(String id) {
        //letter letter digit digit digit digit
        if (id.length() != 6) {
            return false;
        }
        String[] validIDKey = {"letter", "letter",  "digit", "digit", "digit", "digit"};

        for (int i = 0; i < id.length(); i++) {
            if (validIDKey[i].equals("letter")) {
                if (!Character.isDigit(id.charAt(i))) {
                    continue;
                } else {
                    return false;
                }
            }
            if (validIDKey[i].equals("digit")) {
                if (!Character.isDigit(id.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Person findByID(String id, Class neededClass) {
        for (Person person : personList) {
            if (person == null) continue;
            if (person.getClass().equals(neededClass) && person.id.equals(id)) return person;
        }
        return null;
    }

    public static void createTextReport() {
        ArrayList<Faculty> fac = new ArrayList<>();
        ArrayList<Student> stu = new ArrayList<>();
        ArrayList<Staff> sta = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Faculty) {
                fac.add((Faculty) person);
            }
            if (person instanceof Staff) {
                sta.add((Staff) person);
            }
            if (person instanceof Student) {
                stu.add((Student) person);
            }
        }

        try {
            File myObj = new File("report.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("report.txt");
            myWriter.write("Report created on " + java.time.LocalDate.now() + "\n");
            myWriter.write("**************************** \n\n");

            myWriter.write("Faculty Members\n");
            myWriter.write("----------------\n");
            for (int i = 0; i < fac.size(); i++) {
                myWriter.write(i + 1 + "." + fac.get(i) + "\n");
            }
            myWriter.write("\n\n");

            myWriter.write("Staff Member\n");
            myWriter.write("----------------\n");
            for (int i = 0; i < sta.size(); i++) {
                myWriter.write(i + 1 + "." + sta.get(i) + "\n");
            }
            myWriter.write("\n\n");

            myWriter.write("Students\n");
            myWriter.write("----------------\n");
            for (int i = 0; i < stu.size(); i++) {
                myWriter.write(i + 1 + "." + stu.get(i) + "\n");
            }
            myWriter.write("\n\n");

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
