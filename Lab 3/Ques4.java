
class Subtract {

    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }
}

class Ques4 {

    public static void main(String[] args) {
        Subtract ob = new Subtract();
        System.out.println("5 - 2 = " + ob.subtract(5, 2));
        System.out.printf("3.4 - 1.7 = %.2f", ob.subtract(3.4, 1.7));
    }
}