package project2;

public class PersonDB {
    private PersonDB() {
        throw new IllegalStateException("Utility class")
    }
    static int personListCap = 10;
    static Person[] personList = new Person[personListCap];
    static int personListSize = 0;

    public static Person[] getPersonList() {
        return personList;
    }

    public static void setPersonList(Person person) {
        if (personListSize == personListCap) {
            personListCap += 25;
            Person[] temp = new Person[personListCap];
            System.arraycopy(personList, 0, temp, 0, personListSize);
            personList = temp;
        }
        personList[personListSize] = person;
        personListSize++;
    }

    public static Person findByID(String id, Class neededClass) {
        for (Person person: personList) {
            if (person == null) continue;
            if (person.getClass().equals(neededClass) && person.id.equals(id)) return person;
        }
        return null;
    }

    public static void printAll() {
        if (personListSize == 0) System.out.println("No one stored in the database");
        for (Person person: personList) {
            if (person == null) continue;
            person.print();
        }
    }
}
