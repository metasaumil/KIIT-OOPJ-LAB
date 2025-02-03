//find sym of both diagonals of a square matrix

import java.util.Scanner;

class Ques6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and coulmns: ");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int left = 0, right = 0;
        System.out.println("The matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    left += array[i][j];
                }
                if (i + j == n - 1) {
                    right += array[i][j];
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The sum of left diagonal elements is: " + left);
        System.out.println("The sum of right diagonal elements is: "+right);
    }
}