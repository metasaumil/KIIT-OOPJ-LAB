
import java.util.Scanner;

class QuesA {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] name = new String[3], sec = new String[3], branch = new String[3];
            int[] roll = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter name, roll, sec and branch for Student " + (i + 1) + ":");
                name[i] = sc.nextLine();
                roll[i] = sc.nextInt();
                sec[i] = sc.next();
                branch[i] = sc.next();
                sc.nextLine();
            }   for (int i = 0; i < 3; i++) {
                System.out.println("Student " + (i + 1) + " details:");
                System.out.println("Name: " + name[i]);
                System.out.println("Roll No: " + roll[i]);
                System.out.println("Section: " + sec[i]);
                System.out.println("Branch: " + branch[i]);
            }
        }
    }
}