import java.util.Scanner;
class Rect {
    int length, breadth, perimeter, area;
    void read(int l, int b) {
        this.length = l;
        this.breadth = b;
    }
    void calculate() {
        this.perimeter = 2*(this.length + this.breadth);
        this.area = this.length * this.breadth;
    }
    void display() {
        System.out.println("Area = " + this.area);
        System.out.println("Perimeter = " + this.perimeter);
    }
}
class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rect r = new Rect();
        System.out.print("Enter length and breadth: ");
        r.read(sc.nextInt(), sc.nextInt());
        r.calculate();
        r.display();
    }
}