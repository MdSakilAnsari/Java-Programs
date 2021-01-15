//File input and output package of java.
//Writing data in file.
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
class Pep17_5
{
	public static void main(String args[])
	{
		System.out.println("Dealing with java File\n=========================");
		try{
					FileReader f=new FileReader("D://Sakil//Java.txt");
					/*char c[]= new char[100];
					f.read(c);
					System.out.println(c);
					*/int a=0;
					while((a=f.read())!=-1)
					{
					System.out.print((char)a);
					}
					//By using BufferedReader class accessing data from file.
					/*f.skip(10);
					BufferedReader br=new BufferedReader(f);
					String str="";
					while((str=br.readLine())!=null)
					System.out.println(str);
				*/
			}
		catch(Exception e)
		{
			System.out.print("Error-->"+e);
		}
	}
}