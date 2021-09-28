public class Company {

    private final int Size = 10;
    private Employee[] employees;

    public Company() {
        employees = new Employee[Size];
        for (int i = 0; i < Size; i++) {
            employees[i] = null;
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public boolean hire(Employee employee) {
        int i;
        for (i = 0; i < Size; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }
    public boolean fire(int id) {
        int i = search(id);
        if (i == -1) return false;
        employees[i] = null;
        return true;
    }

    public int search(int id) {
        for (int i = 0; i < Size; i++) {
            if (employees[i] != null) {
                if (employees[i].getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Employee getEmployee(int id) {
        for (int i = 0; i < Size; i++) {
            if (employees[i] != null) {
                if (employees[i].getId() == id) return employees[i];
            }
        }
        System.out.println("Sorry but no employee with that id was found");
        return null;
    }

    public String toString() {
        String all = "";
        boolean empty = true;
        for (int i = 0; i < Size; i++) {
            if (employees[i] != null) {
                all += employees[i];
                empty = false;
            }
        }
        if (empty) System.out.println("No employees in your company");
        return all;
    }
}
