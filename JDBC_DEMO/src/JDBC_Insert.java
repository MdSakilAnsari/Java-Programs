import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_Insert {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Select Option to perform operation\n==================================");
		System.out.println("1-Insert data");
		System.out.println("2-View all data");
		System.out.println("3-View By Id data");
		System.out.println("4-Update data");
		System.out.println("5-Delete data");
		System.out.println("6-Break");
		int ch=s.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/panchwati","root","");
			System.out.println("Connected!!!!");
			switch(ch)
			{
				case 1:	System.out.print("Enter user id:\t");
						int id=s.nextInt();
						System.out.print("Enter user Name:\t");
						String name=s.next();
						System.out.print("Enter user Email:\t");
						String email=s.next();
						System.out.print("Enter user Password:\t");
						String pass=s.next();
						System.out.print("Enter user City:\t");
						String city=s.next();
						System.out.print("Enter user Address:\t");
						String address=s.next();
						System.out.print("Enter user Contact:\t");
						String contact=s.next();
						PreparedStatement pi=con.prepareStatement("insert into users values(?,?,?,?,?,?,?)");
						pi.setInt(1, id);
						pi.setString(2, name);
						pi.setString(3, email);
						pi.setString(4, pass);
						pi.setString(5, city);
						pi.setString(6, address);
						pi.setString(7, contact);
						int a=pi.executeUpdate();
						if(a>0)
						{
							System.out.println(a+" Row affected..");
			
						}
						else
						{
							System.out.println("Something went wrong..");
			
						}
						break;
						
				case 2: PreparedStatement pall=con.prepareStatement("select * from users");
						ResultSet rs=pall.executeQuery();
						while(rs.next())
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
						break;
						
				case 3:	System.out.print("Enter user id:\t");
						int fid=s.nextInt();
						System.out.print("Enter user Name:\t");
						String fname=s.next();
						PreparedStatement pvId=con.prepareStatement("Select * from users where Id=? and Name=? ");
						pvId.setInt(1, fid);
						pvId.setString(2, fname);
						ResultSet rsvID=pvId.executeQuery();
						while(rsvID.next())
						System.out.println(rsvID.getInt(1)+"\t"+rsvID.getString(2)+"\t"+rsvID.getString(3)+"\t"+rsvID.getString(4)+"\t"+rsvID.getString(5)+"\t"+rsvID.getString(6));
						
				case 4:	System.out.print("Enter user id:\t");
						int uid=s.nextInt();
						System.out.print("Enter user new Value:\t");
						String uname=s.next();
						PreparedStatement ps=con.prepareStatement("Update users set Address=? where Id=?");
						ps.setString(1, uname);
						ps.setInt(2, uid);
						int ua=ps.executeUpdate();
						if(ua>0)
						{
							System.out.println(ua+" Row affected..");

						}
						else
						{
							System.out.println("Something went wrong..");

						}
						break;
						
				case 5: System.out.print("Enter user id:\t");
						int dId=s.nextInt();
						PreparedStatement psDel=con.prepareStatement("delete * from users where Id=?");
						psDel.setInt(1, dId);
						int uDel=psDel.executeUpdate();
						if(uDel>0)
						{
							System.out.println(uDel+" Row affected..");
						}
						else
						{
							System.out.println("Something went wrong..");
		
						}
						break;

				case 6: System.out.println("Thanks for your response.");
						break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
