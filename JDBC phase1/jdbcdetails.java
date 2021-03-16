import java.sql.*;
class jdbcdetails
 {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            //creating a connection(
            String url = "jdbc:mysql://localhost:3306/details1";
            String username= "root";
            String password= "root";

            Connection con=DriverManager.getConnection(url,username,password);

            String q="insert into table2(tName,tCity) values(?,?)";

            //get preparedstatement object

            PreparedStatement pstmt = con.prepareStatement(q);


        //set values to query
            pstmt.setString(1,"Tushar");
            pstmt.setString(2,"Ghaziabad");

            pstmt.executeUpdate();

            System.out.println("inserted");
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
