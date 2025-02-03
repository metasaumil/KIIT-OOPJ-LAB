
import java.util.Scanner;

class QuesD {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int n = sc.nextInt(), temp = n, sum = 0;
            while (temp > 0) {
                sum = sum * 10 + (temp % 10);
                temp /= 10;
            }
            if (sum == n)
                System.out.println("Palindrome sucessfully detected");
            else
                System.out.println("The input number is not palindrome");
        }
    }
}