import java.sql.*;

public class sql1 {
    public static void main(String[] args) {
        try {
            String url= "jdbc:mysql://localhost:3306/";
            String uname= "root";
            String password = "sawant@229";

            Connection con= DriverManager.getConnection(url, uname, password);
          //  Class.forName("oracle.jdbc.driver.OracleDriver");
          Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connected succefully");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
