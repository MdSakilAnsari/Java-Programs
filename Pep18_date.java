//File input and output package of java.
//Dealing with date.
import java.util.Date;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
class Pep18_date
{
	public static void main(String args[])
	{
			Date curDate=new Date();
			System.out.println("******"+curDate);
			try
			{
				/*FileOutputStream fos=new FileOutputStream("D://Sakil//date.txt");
				ObjectOutputStream ois=new ObjectOutputStream(fos);
				ois.writeObject(curDate);
				ois.flush();
				ois.close();
				System.out.println("Executed...");*/
				
				FileInputStream fis=new FileInputStream("D://Sakil//date.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				Date d1=(Date)ois.readObject();
				System.out.println("======"+d1);
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