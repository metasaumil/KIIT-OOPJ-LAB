import javax.net.ssl.HostnameVerifier;
import java.io.PrintStream;
import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}
class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}
class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

public class Ques4 {

    public static void displayTime(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if(hours<0||hours>=24)
            throw new HrsException("Invalid hours: "+hours);
        if(minutes<0||minutes>=60)
            throw new MinException("Invalid minutes: "+minutes);
        if(seconds<0||seconds>=60)
            throw new SecException("Invalid seconds: "+seconds);
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours, minutes and seconds:");
        int hours = sc.nextInt(), minutes = sc.nextInt(), seconds = sc.nextInt();
        try {
            displayTime(hours, minutes, seconds);
        }
        catch (HrsException | MinException | SecException e) {
            System.out.println("Exception caught!\n" + e.getMessage());
        }
    }
}