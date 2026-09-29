class Employee {
    String employeeName;
    int employeeId;

    public void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public void writeCode() {
        System.out.println(
                employeeName + " is writing code in " + programmingLanguage
        );
    }
}

class Manager extends Employee {
    String department;

    public void conductMeeting() {
        System.out.println(
                employeeName + " is conducting a meeting for "
                        + department + " department."
        );
    }
}

public class Q12EmployeeDeveloperManager {
    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.employeeName = "Arjun";
        developer.employeeId = 301;
        developer.programmingLanguage = "Java";

        Manager manager = new Manager();
        manager.employeeName = "Sneha";
        manager.employeeId = 302;
        manager.department = "Human Resources";

        System.out.println("Developer:");
        developer.displayEmployee();
        developer.writeCode();

        System.out.println("\nManager:");
        manager.displayEmployee();
        manager.conductMeeting();
    }
}
