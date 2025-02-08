public class Ques2 {
    public static void main(String[] args) {
        try {
            System.out.print("1 / 0 = ");
            System.out.println(1 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("\nArithmeticException caught by try-catch-finally block");
        }
    }
}