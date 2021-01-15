import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetaData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/panchwati","root","");
			System.out.println("Connected!!!!");
			Statement stst=con.createStatement();
			ResultSet rs=stst.executeQuery("select * from users");
			ResultSetMetaData data=rs.getMetaData();
			int tot=data.getColumnCount();
			for(int i=1;i<tot;i++)
				System.out.println(data.getColumnName(i)+"\t"+data.getColumnTypeName(i)+"\t"+data.getColumnDisplaySize(i));
					
		}
		catch(Exception e)
		{
			System.out.println("Not created!!!"+e);
		}

	}

}
