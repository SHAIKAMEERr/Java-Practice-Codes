import java.sql.*;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql:student.db");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from student_details");
            int id;
            String name;
            while(rs.next())
            {
                id=rs.getInt("std_id");
                name=rs.getString("std_name");
                System.out.println(id +" "+name);
            }
            con.close();
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }
}