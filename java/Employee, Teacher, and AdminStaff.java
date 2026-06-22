class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
    }
}
class Teacher extends Employee {

    Teacher(String name) {
        super(name);
    }
    @Override
    public void displayDetails() {
        System.out.println("Teacher Name: " + name);
    }
}
class AdminStaff extends Employee {
    AdminStaff(String name) {
        super(name);
    }
    @Override
    public void displayDetails() {
        System.out.println("Admin Staff Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee t = new Teacher("Ankit");
        Employee a = new AdminStaff("Rahul");

        t.displayDetails();
        a.displayDetails();
    }
}