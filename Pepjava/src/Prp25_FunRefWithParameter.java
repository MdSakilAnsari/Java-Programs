
interface Sizeable1
{ 
	public void size();
}

class Test1
{
	
	public Test1() {
		System.out.println("Method refrence with constructor");
		}

	public static void display(int x)
	{
		System.out.println("Sizeable with method refrence");
	}
}

public class Prp25_FunRefWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 s1=new Test1();
		Sizeable1 s2=Test1::new;
		s2.size();

	}

}
