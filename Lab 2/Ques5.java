
import java.util.Scanner;

class Ques5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count = 0, flag = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    flag++;
                }
            }
            if (flag != 0) {
                continue;
            }
            for (int j = i; j < n; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            System.out.println("Occurance of " + array[i] + ": " + count);
        }
    }
}
