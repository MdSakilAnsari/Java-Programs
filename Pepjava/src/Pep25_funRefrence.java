
interface Sizeable
{ 
	public void size();
}

class Test
{
	
	public Test() {
		System.out.println("Method refrence with constructor");
		}

	public static void display()
	{
		System.out.println("Sizeable with method refrence");
	}
}
public class Pep25_funRefrence {

	public static void main(String[] args) {
		
		Sizeable s=()->System.out.println("Sizeable with lambda");
		s.size();
		Sizeable s1=Test::new;
		s1.size();
		Sizeable s2=Test::display;
		s2.size();
	}

}
