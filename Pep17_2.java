//File input and output package of java.
//Making files in Directory by using Files.
import java.util.*;
import java.io.File;
import java.io.IOException;
class Pep17_2
{
	public static void main(String args[])
	{
		System.out.println("Dealing with java File\n=========================");
		File f=new File("D://Sakil//Java.txt");
		try{
					f.createNewFile();
					System.out.println("Directory created..");
		
			}
		catch(Exception e)
		{
			System.out.print("Error-->"+e);
		}
	}
}