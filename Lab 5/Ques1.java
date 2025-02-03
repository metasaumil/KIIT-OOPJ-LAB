
abstract class Student {
    int rollNo, regNo;

    public void getInput(int rollNo, int regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    public abstract void course();
}

class Kiitian extends Student {
    String course;

    @Override
    public void course() { course = "B.Tech (Computer Science & Engg)"; }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Reg No: " + regNo);
        System.out.println("Course: " + course);
    }
}

public class Ques1 {
    public static void main(String[] args) {

        Kiitian student = new Kiitian();
        student.getInput(12345, 98765);
        student.course();
        student.display();
    }
}