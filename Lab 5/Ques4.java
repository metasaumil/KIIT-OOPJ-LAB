
interface Employee {
    void getDetails(int empId, String empName);
}

interface Manager_4 extends Employee {
    void getDeptDetails(int deptId, String deptName);
}

class Head implements Manager_4 {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    @Override
    public void getDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public void getDeptDetails(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }
}

public class Ques4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine()+sc.nextLine();

        System.out.print("Enter Department ID: ");
        int deptId = sc.nextInt();
        System.out.print("Enter Department Name: ");
        String deptName = sc.nextLine()+sc.nextLine();

        Head head = new Head();

        head.getDetails(empId, empName);
        head.getDeptDetails(deptId, deptName);

        head.displayDetails();
    }
}