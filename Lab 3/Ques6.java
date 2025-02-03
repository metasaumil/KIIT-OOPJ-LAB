
import java.util.Scanner;

class Rectangle {

    int length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    int area() { return this.length * this.breadth; }
}

class Ques6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.print("Enter the length and breadth: ");
        r = new Rectangle(sc.nextInt(), sc.nextInt());
        System.out.println("Area of rectangle: " + r.area());

    }
}