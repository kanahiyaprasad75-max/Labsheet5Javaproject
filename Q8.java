class Person {
    String name;

    public void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    public void displayEmployee() {
        displayName();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    public void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class Q8PersonEmployeeManager {
    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.name = "Neha";
        manager.employeeId = 201;
        manager.department = "Finance";

        manager.displayManager();
    }
}
