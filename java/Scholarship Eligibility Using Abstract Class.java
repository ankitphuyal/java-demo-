abstract class Scholarship {
    String studentName;

    Scholarship(String studentName) {
        this.studentName = studentName;
    }

    // Abstract method
    abstract void checkEligibility();
}

class MeritScholarship extends Scholarship {

    MeritScholarship(String studentName) {
        super(studentName);
    }

    @Override
    void checkEligibility() {
        System.out.println(studentName + " is eligible for Merit Scholarship.");
    }
}

class NeedBasedScholarship extends Scholarship {

    NeedBasedScholarship(String studentName) {
        super(studentName);
    }

    @Override
    void checkEligibility() {
        System.out.println(studentName + " is eligible for Need-Based Scholarship.");
    }
}

public class Main {
    public static void main(String[] args) {

        Scholarship s1 = new MeritScholarship("Ankit");
        Scholarship s2 = new NeedBasedScholarship("Rahul");

        s1.checkEligibility();
        s2.checkEligibility();
    }
}