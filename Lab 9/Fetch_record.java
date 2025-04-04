import java.sql.*;
import java.util.*;
public class Fetch_record {
    public static void main(String arg[]){
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="saumil2";
        String password="12345";
        Scanner in =new Scanner(System.in);
        System.out.println("Enter roll number whose details are required:");
        int roll=in.nextInt();
        in.nextLine();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url, username, password);
            String query="Select * from STUDENT where ROLL= ?";
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1,roll);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            }
        } 
        catch (Exception e) {
            System.out.println("Exception occured !! "+e);
        }

    }
    
    
}