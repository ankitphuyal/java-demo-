import java.util.ArrayList;
class Course {
    private String courseName;
    public Course(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
}
class Student {
    private String name;
    private ArrayList<Course> courses;
    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public void displayCourses() {
        System.out.println("Student Name: " + name);
        System.out.println("Registered Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ankit");

        Course c1 = new Course("Java Programming");
        Course c2 = new Course("Database Management");
        Course c3 = new Course("Operating System");

        student.addCourse(c1);
        student.addCourse(c2);
        student.addCourse(c3);

        student.displayCourses();
    }
}