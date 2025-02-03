
import java.util.Scanner;

class QuesE {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String first = sc.next(), last = sc.next();
            System.out.println(last + " " + first);
        }
    }
}