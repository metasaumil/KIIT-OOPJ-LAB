import java.io.*;
public class Ques4 {
    public static void main(String[] args) {
        String file1 = "file1.bin";
        String file2 = "file2.bin";
        compareBinaryFiles(file1, file2);
    }

    static void compareBinaryFiles(String file1, String file2) {
        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1, byte2;
            int position = 0;

            while (true) {
                byte1 = fis1.read();
                byte2 = fis2.read();

                if (byte1 == -1 && byte2 == -1) {
                    System.out.println("Files are identical.");
                    return;
                }

                if (byte1 != byte2) {
                    System.out.println("Files differ at byte position: " + position);
                    return;
                }

                position++;
            }

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}