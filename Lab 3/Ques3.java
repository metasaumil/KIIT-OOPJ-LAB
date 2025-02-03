import java.util.Scanner;
class Student {
    int roll;
    String name;
    float cgpa;
}
class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            student[i] = new Student();
            System.out.println("Enter details for student " + (i + 1));
            student[i].roll = sc.nextInt();
            student[i].name = sc.nextLine() + sc.nextLine();
            student[i].cgpa = sc.nextFloat();
        }

        System.out.printf("%-15s%-15s%-15s\n", "Roll No", "Name", "CGPA");
        for (int i = 0; i < n; i++)
            System.out.printf("%-15s%-15s%-15s\n", Integer.toString(student[i].roll), student[i].name, Float.toString(student[i].cgpa));

        float min = Float.MAX_VALUE;
        String name = "";
        for (int i = 0; i < n; i++)
            if (student[i].cgpa < min) {
                min = student[i].cgpa;
                name = student[i].name;
            }
        System.out.print("Student with the lowest cgpa is " + name + " with " + min + " cgpa");
    }
}