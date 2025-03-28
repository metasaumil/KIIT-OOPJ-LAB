import java.io.*;
import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String sourceFile = scanner.nextLine();
        System.out.print("Enter destination file name (for character stream): ");
        String charDestFile = scanner.nextLine();
        System.out.print("Enter destination file name (for byte stream): ");
        String byteDestFile = scanner.nextLine();
        copyUsingCharacterStream(sourceFile, charDestFile);
        copyUsingByteStream(sourceFile, byteDestFile);
        scanner.close();
    }

    public static void copyUsingCharacterStream(String source, String destination) {
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(destination)) {

            int ch;
            while ((ch = fr.read()) != -1)
                fw.write(ch);
            System.out.println("File copied successfully using Character Stream to " + destination);
        } catch (IOException e) {
            System.out.println("Error using Character Stream: " + e.getMessage());
        }
    }

    public static void copyUsingByteStream(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            while ((data = fis.read()) != -1)
                fos.write(data);
            System.out.println("File copied successfully using Byte Stream to " + destination);
        } catch (IOException e) {
            System.out.println("Error using Byte Stream: " + e.getMessage());
        }
    }
}