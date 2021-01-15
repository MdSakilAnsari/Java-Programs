
import java.util.Arrays;
/*String str[]= {"A","E","G","B","D","C"};
Arrays.sort(str);
System.out.println(Arrays.binarySearch(str,"C"));*/

//Normally used inner class when we are working on swing for GUI development.
//We can use mehod or variable of outer class in inner class and also inner class to outer method. by creating object (new outer().num)
//Method inner class, Annonymous inner class, Nested class-->A class inside the Class.
class Outer
{
	public void display()
	{
		System.out.println("Outer class");
	}
	class Inner
	{
		public void printMsg()
		{
			System.out.println("Inner class");
		}
		
	}
}
public class Pep24_InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.display();
		
	}

}
