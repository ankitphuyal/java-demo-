class Attendance {

    public void calculateAttendance(int attended, int total) {
        double percentage = (attended * 100.0) / total;
        System.out.println("Attendance: " + percentage + "%");
    }
}

class EngineeringAttendance extends Attendance {

    @Override
    public void calculateAttendance(int attended, int total) {
        double percentage = (attended * 100.0) / total;
        System.out.println("Engineering Attendance: " + percentage + "%");
    }
}

class MedicalAttendance extends Attendance {

    @Override
    public void calculateAttendance(int attended, int total) {
        double percentage = (attended * 100.0) / total;
        System.out.println("Medical Attendance: " + percentage + "%");
    }
}

public class Main {
    public static void main(String[] args) {

        Attendance eng = new EngineeringAttendance();
        Attendance med = new MedicalAttendance();

        eng.calculateAttendance(85, 100);
        med.calculateAttendance(90, 100);
    }
}