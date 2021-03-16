import java.sql.*;
class jdbcdata
 {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/details1";
            String username= "root";
            String password= "root";

            Connection con=DriverManager.getConnection(url,username,password);

            //Creating a query
            String q= "create table table2(tId int(20) primary key auto_increment,tName varchar(200) not null , tCity varchar(400))";

            Statement stmt=con.createStatement();

            stmt.executeUpdate(q);

            System.out.println("table created in database");
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }



}