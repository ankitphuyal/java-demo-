class Member {
    String name;

    Member(String name) {
        this.name = name;
    }

    void borrowingLimit() {
        System.out.println("Borrowing limit not specified.");
    }
}

class StudentMember extends Member {

    StudentMember(String name) {
        super(name);
    }

    @Override
    void borrowingLimit() {
        System.out.println(name + " can borrow up to 5 books.");
    }
}

class TeacherMember extends Member {

    TeacherMember(String name) {
        super(name);
    }

    @Override
    void borrowingLimit() {
        System.out.println(name + " can borrow up to 10 books.");
    }
}

public class Main {
    public static void main(String[] args) {
        Member student = new StudentMember("Ankit");
        Member teacher = new TeacherMember("Rahul");

        student.borrowingLimit();
        teacher.borrowingLimit();
    }
}