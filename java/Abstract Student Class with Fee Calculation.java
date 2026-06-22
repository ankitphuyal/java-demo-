abstract class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    // Abstract Method
    abstract void calculateFee();
}
class Undergraduate extends Student {
    Undergraduate(String name) {
        super(name);
    }
    @Override
    void calculateFee() {
        System.out.println(name + "'s Undergraduate Fee: Rs. 50,000");
    }
}
class Graduate extends Student {
    Graduate(String name) {
        super(name);
    }
    @Override
    void calculateFee() {
        System.out.println(name + "'s Graduate Fee: Rs. 80,000");
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Undergraduate("Ankit");
        Student s2 = new Graduate("Rahul");

        s1.calculateFee();
        s2.calculateFee();
    }
}