interface ResultProcessor {
    void calculateGrade(int marks);
}

class EngineeringDepartment implements ResultProcessor {

    @Override
    public void calculateGrade(int marks) {
        if (marks >= 80)
            System.out.println("Engineering Grade: A");
        else if (marks >= 60)
            System.out.println("Engineering Grade: B");
        else
            System.out.println("Engineering Grade: C");
    }
}

class ManagementDepartment implements ResultProcessor {

    @Override
    public void calculateGrade(int marks) {
        if (marks >= 75)
            System.out.println("Management Grade: A");
        else if (marks >= 55)
            System.out.println("Management Grade: B");
        else
            System.out.println("Management Grade: C");
    }
}

public class Main {
    public static void main(String[] args) {
        ResultProcessor eng = new EngineeringDepartment();
        ResultProcessor mgmt = new ManagementDepartment();

        eng.calculateGrade(78);
        mgmt.calculateGrade(78);
    }
}