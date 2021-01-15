import java.util.*;
import java.util.TreeSet;
class Abhi implements Comparable<Abhi>
{
	String name;
	Integer salary;
	public Abhi(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		System.out.println("--------------------");
		return name+"\t"+salary;
	}
	@Override
	public int compareTo(Abhi o) {
		return this.name.compareTo(o.name);//It will print the object in ascending order.
	}
	
}

public class Pep21_Tree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n1 for name\n2 for salary");
		int ch=sc.nextInt();
		Set<Abhi> s=new TreeSet<Abhi>();
		s.add(new Abhi("c",2000));
		s.add(new Abhi("d",1200));
		s.add(new Abhi("x",1800));
		s.add(new Abhi("f",1400));
		s.add(new Abhi("g",1500));
		if(ch==1)
		System.out.println(s);
		else if(ch==2)
			System.out.println(s);
		else
			System.out.println("Wrong selection");
		

	}

}
