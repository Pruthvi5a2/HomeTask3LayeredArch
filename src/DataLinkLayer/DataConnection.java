package DataLinkLayer;
import java.sql.*;
public class DataConnection {
	public void data(int x,int  y,int z,String s)
	{
		try
		{
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			PreparedStatement ps=c.prepareStatement("insert into "+s+" values(?,?,?)");
			ps.setInt(1,x);
			ps.setInt(2,y);
			ps.setInt(3,z);
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
