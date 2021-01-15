//File input and output package of java.
//Making Directory in Drive by using Files.
import java.util.*;
import java.io.File;
import java.io.IOException;
class Pep17_3
{
	public static void main(String args[])
	{
		System.out.println("Dealing with java File\n=========================");
		File f=new File("D://Sakil");
		try{
					f.mkdir();
					System.out.println("Directory created..");
		
			}
		catch(Exception e)
		{
			System.out.print("Error-->"+e);
		}
	}
}