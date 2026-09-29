class Student {
    private String name;
    private int rollNo;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Q1Student {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Rahul");
        student.setRollNo(101);
        student.setMarks(87.5);

        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Marks: " + student.getMarks());

        System.out.println("\nUsing displayDetails():");
        student.displayDetails();
    }
}
