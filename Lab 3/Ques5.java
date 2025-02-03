
class Area {

    int area(int  a) {
        return a * a;
    }

    double area(double r) {
        return Math.PI * r * r;
    }

    double area(int b, int h) {
        return 0.5 * b * h;
    }

}

class Ques5 {

    public static void main(String[] args) {

        Area ob = new Area();
        System.out.println("Area of circle with radius 5 is " + ob.area(5.0));
        System.out.println("Area of triangle with base = 5, height = 10 is " + ob.area(5, 10));
        System.out.println("Area of square with side 5 is " + ob.area(5));

    }
}