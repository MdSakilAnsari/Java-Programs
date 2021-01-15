//File input and output package of java.
//Dealing with Serialization through Serializable interface..
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
class Car
{
	String carName="Honda";
}
class Employee implements Serializable
{
	String str="Abhishek";
	transient Car c=new Car();
}
class Pep18_classObject10
{
	public static void main(String args[])
	{
			Employee emp=new Employee();
			System.out.println(emp.str);
			System.out.println(emp.c.carName);
			
			try
			{
				
				//De-serialization..
				FileInputStream fis=new FileInputStream("D://Sakil//ObjectClass.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				Employee e=(Employee)ois.readObject();
				System.out.println("======"+e.str);
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