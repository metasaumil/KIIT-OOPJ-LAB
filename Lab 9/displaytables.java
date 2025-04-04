import java.sql.*;
import java.util.Scanner;

public class displaytables                  {
    // Database credentials (Modify as per your database setup)
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "saumil2"; // Replace with actual DB username
    private static final String PASSWORD = "12345"; // Replace with actual DB password

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();

        fetchStudentRecord(rollNo);
        scanner.close();
    }

    public static void fetchStudentRecord(int rollNo) {
        String query = "SELECT * FROM student WHERE ROLL = ?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = con.prepareStatement(query)) {

            stmt.setInt(1, rollNo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("\nStudent Details:");
                System.out.println("Roll No: " + rs.getInt("ROLL"));
                System.out.println("Name: " + rs.getString("NAME"));
                System.out.println("Hostel: " + rs.getString("HOSTEL"));
                System.out.println("Address: " + rs.getString("ADDRESS"));
                System.out.println("Section: " + rs.getInt("SECTION"));
            } else {
                System.out.println("No student found with Roll Number: " + rollNo);
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}