//File input and output package of java.
//Writing data in file.
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
class Pep17_4
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=s.nextLine();
		System.out.println("Enter Mobile");
		int mob=s.nextInt();
		System.out.println("Dealing with java File\n=========================");
		try{
					FileWriter f=new FileWriter("D://Sakil//Java.txt",true);
					f.write(name+"\t"+mob+"\n");
					f.flush();
					//f.close() It will flush the data and close the file.
					System.out.println("Data Written..");
		
			}
		catch(Exception e)
		{
			System.out.print("Error-->"+e);
		}
	}
}