import java.sql.*;
public class Display_details {
    public static void main(String arg[]){
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="saumil2";
        String password="12345";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url,user,password);
            Statement st=con.createStatement();
            String query="Select * from student";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            for(int i=1;i<=columnCount;i++){
                System.out.print(rsmd.getColumnName(i)+"\t\t\t");
            }
            System.out.println();

            //System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5));
            while(rs.next()){
                for(int i=1;i<=columnCount;i++){
                    System.out.print(rs.getString(i)+"\t\t\t");
                }
                System.out.println();
            }
        } 
        catch (Exception e) {
            System.out.println("Exception occurred !!"+e);

        }
    }
    
}