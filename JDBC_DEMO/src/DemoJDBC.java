import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DemoJDBC {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter user id:\t");
		int id=s.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/panchwati","root","");
			System.out.println("Connected!!!!");
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("Select * from users where Id="+id);
			if(rs.next())
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			else
				System.out.println("User not found..");
		} catch (Exception e) {
	
		System.out.print(e);
		}
	}

}
