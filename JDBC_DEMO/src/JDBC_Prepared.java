import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Prepared {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter user id:\t");
		int id=s.nextInt();
		System.out.print("Enter user Name:\t");
		String name=s.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/panchwati","root","");
			System.out.println("Connected!!!!");
			//PreparedStatement ps=con.prepareStatement("Select * from users where Name Like '_a%' ");
			
			PreparedStatement ps=con.prepareStatement("Select * from users where Id=? and Name=? ");//To search by User Id and Name
			ps.setInt(1, id);
			ps.setString(2, name);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())//Use IF in place of while if you sure only one record with else statement.
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
	
				System.out.println("User not found..");

			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
