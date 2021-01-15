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
class Pep18_classObject
{
	public static void main(String args[])
	{
			Employee emp=new Employee();
			System.out.println(emp.str);
			try
			{
				//Serialization...
				FileOutputStream fos=new FileOutputStream("D://Sakil//ObjectClass.txt");
				ObjectOutputStream ois=new ObjectOutputStream(fos);
				ois.writeObject(emp);
				ois.flush();
				ois.close();
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