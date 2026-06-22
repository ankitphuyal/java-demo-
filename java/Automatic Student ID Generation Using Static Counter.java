class Student {
    private static int counter = 1000; // Static counter
    private int studentId;
    private String name;

    public Student(String name) {
        this.name = name;
        this.studentId = ++counter; // Auto-generate ID
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Ankit");
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Sita");

        s1.displayDetails();
        System.out.println();

        s2.displayDetails();
        System.out.println();

        s3.displayDetails();
    }
}