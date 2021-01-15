//File input and output package of java.
//Dealing with date.
import java.util.Date;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
class Pep18_dateWrite
{
	public static void main(String args[])
	{
			Date curDate=new Date();
			System.out.println("******"+curDate);
			try
			{
				FileOutputStream fos=new FileOutputStream("D://Sakil//date.txt");
				ObjectOutputStream ois=new ObjectOutputStream(fos);
				ois.writeObject(curDate);
				ois.flush();
				ois.close();
				System.out.println("Executed...");
				
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally{
			System.out.println("Executed...");
			}
	}
}