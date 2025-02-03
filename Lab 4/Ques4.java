import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        acc_no = sc.nextInt();
        System.out.println("Enter Account Balance:");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Balance: Rs " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter Name:");
        name = sc.next();
        System.out.println("Enter Aadhar Number:");
        aadhar_no = sc.next();
    }

    @Override
    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }

        System.out.println("\nDisplaying details of all persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDetails of Person " + (i + 1) + ":");
            persons[i].disp();
        }
    }
}