import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] array = new int[4];
            for (int i = 0; i < 5; i++)
                array[i] = sc.nextInt();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException");
        }
    }
}