import java.sql.*;
class jdbc 
{
    public static void main(String[] args)
    {
        try
        {
            Class.forname("com.mysql.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/details1";
            String username= "root";
            String password= "root";

            Connection con =DriveManager.getConnection(url,username,password);

            if(con.isClosed())
            {
                System.out.println("Connection is closed");
            }else
            {
                System.out.println("Connection is created...");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();



        }
    }

}