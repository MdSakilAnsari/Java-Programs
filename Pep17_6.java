//File input and output package of java.
//Writing data in file.
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
class Pep17_6
{
	public static void main(String args[])
	{
		byte b[]=new byte[50];
		System.out.println("Dealing with java File\n=========================");
		try{
			FileInputStream fis=new FileInputStream("D://Sakil//Java.txt");
			int a=0;
			while((a=fis.read())!=-1)
			{
				System.out.print((char)a);
			}
			
			FileOutputStream fos=new FileOutputStream("D://Sakil//Java1.txt");
			fos.write(b);
			fos.flush();
			System.out.print("Written..");
			}
		catch(Exception e)
		{
			System.out.print("Error-->"+e);
		}
	}
}