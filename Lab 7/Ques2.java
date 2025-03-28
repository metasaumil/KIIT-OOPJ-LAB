import java.io.*;
import  java.util.Scanner;
class Ques2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            FileWriter fw = new FileWriter("student.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.print("Enter the number of students: ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter roll number, name, subject and marks: ");
            for(int i = 0; i<n; i++) {
                String roll = sc.nextLine();
                String name = sc.nextLine();
                String marks = sc.nextLine();
                String sub = sc.nextLine();
                bw.write(roll+", "+name+", "+sub+", "+marks);
                bw.newLine();
            }
            bw.close();

            FileReader fr = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine()) != null) {
                String[] str = line.split(",");
                System.out.println("Roll Number: "+str[0]+", Name: "+str[1]+", Subject: "+str[2]+", Marks: "+str[3]);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}