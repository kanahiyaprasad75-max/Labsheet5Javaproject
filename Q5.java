class Person {
    String name;
    int age;

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    public void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Q5PersonStudent {
    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Priya";
        student.age = 20;
        student.rollNo = 101;
        student.course = "Computer Science";

        student.displayStudent();
    }
}
