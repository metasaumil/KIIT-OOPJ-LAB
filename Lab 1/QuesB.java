
import java.util.Scanner;

class QuesB {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the marks: ");
            int marks = sc.nextInt();
            if (marks > 100 || marks < 0) {
                System.out.println("Invalid Marks");
            }else if (marks >= 90) {
                System.out.println("A-Excellent");
            }else if (marks >= 80) {
                System.out.println("B-Very good");
            }else if (marks >= 70) {
                System.out.println("C-Good");
            }else if (marks >= 60) {
                System.out.println("D-Satisfactory");
            }else if (marks >= 50) {
                System.out.println("E-Work hard");
            }else if (marks >= 40) {
                System.out.println("F-Just passed");
            }else {
                System.out.println("Failed");
            }
        }
    }
}
