import java.sql.*;
import java.util.Scanner;
public class insertion {
    public static void main(String arg[]) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your details(in format): \nRoll\nName\nHostel\nAddress\nSection:\n");
        int roll=in.nextInt();
        in.nextLine();
        String name=in.nextLine();
        String hostel=in.nextLine();
        String address=in.nextLine();
        int section=in.nextInt();
        in.nextLine();
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="saumil2";
        String password="12345";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url,username,password);
            String query="Insert into student values(?,?,?,?,?)";
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1,roll);
            st.setString(2, name);
            st.setString(3,hostel);
            st.setString(4,address);
            st.setInt(5,section);
            int row=st.executeUpdate();
            System.out.println("Table updated !!");
            System.out.println("Affected row: "+row);  
            st.close();
            con.close();   
        } 
        catch (Exception e) {
            System.out.println("Exception occurred !!"+e);
        }
    }
}