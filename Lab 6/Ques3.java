import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Ques3 {

    public void processInput(int number) throws NegativeNumberException {
        if (number < 0)
            throw new NegativeNumberException("Negative numbers are not allowed: " + number);
        else
            System.out.println("Double value: " + (number * 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        scanner.close();

        Ques3 ob = new Ques3();

        try {
            ob.processInput(userInput);
        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}