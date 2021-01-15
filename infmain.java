import java.util.*;
interface Sakil
{
	public void hello();
	public static void message()
	{
		System.out.println("THis is Static method");	
	}
}
interface Abhi
{
	public void helloAbhi();
}
class A implements Sakil,Abhi
{
	public void hello()
	{
	System.out.println("THis is Hello  method");
		try 
		{ 
			int x = 0; 
			int y = 5 / x; 
		} 
		catch (ArithmeticException ae) 
		{
			System.out.println(" Arithmetic Exception"); 
		} 
		catch (Exception e) 
		{
			System.out.println("Exception"); 
		} 
		
		System.out.println("finished");

	}
	public void helloAbhi()
	{
	System.out.println("THis is Hello  method of Abhishek");	
	}
}
class infmain
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.hello();
		obj.helloAbhi();
		Sakil.message();
		System.out.println("main class");
	}
}