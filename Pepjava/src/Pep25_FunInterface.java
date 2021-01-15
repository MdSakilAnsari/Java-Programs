
//Interface which have single abstract method is known as functional interface.
//Lambda expression work only if you have functional interface.
//
interface Calculator{
	public int calculate(int a,int b);
}

public class Pep25_FunInterface {

	public static void main(String[] args) {
		Calculator s=(x,y)->x+y;
			System.out.println(s.calculate(12,5));
		Calculator s1=(x,y)->x*y;
			System.out.println(s1.calculate(12,5));
		Calculator s2=(x,y)->x/y;
			System.out.println(s2.calculate(12,4));
		}

	

}
