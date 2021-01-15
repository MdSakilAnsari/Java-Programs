N//File input and output package of java.
//Stream is sequence of data.
//You can perform I/O operation using reader/writer or Stream.
//FileReader and FileWriter class is inside the reader/writer class.It reads data in the form of character.
//FileInputStream and FileOutputStream are class of Stream.It reads data in the form of bytes.
//Source can be File Socket or Thread.
import java.util.*;
import java.io.File;
import java.io.IOException;
class Pep17
{
	public static void main(String args[])
	{
		System.out.println("Dealing with java File\n=========================");
		File f=new File("D://javap");
		try{
			String fname[]=f.list();
			for(String s:fname)
			{
				System.out.println(s);
				File f1=new File(f,s);
				if(f1.isFile())
				{
					System.out.println(s+"-->is File");
		
				}
				else
				{
					System.out.println(s+"-->is Directory");
		
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.print("Error-->"+e);
		}
	}
}