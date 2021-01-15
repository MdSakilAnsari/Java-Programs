import java.util.*;
class SortByName implements Comparator<Dept>
{
	public int compare(Dept a1,Dept a2)
	{
		return a1.name.compareTo(a2.name);
	}
}
class SortBySalary implements Comparator<Dept>
{
	public int compare(Dept a1,Dept a2)
	{
		return a1.salary.compareTo(a2.salary);
	}
}
class Dept 
{
	String name;
	Integer salary;
	public Dept(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return name+"\t"+salary;
	}
}

public class Pep22_Compa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n1 for name\n2 for salary");
		int ch=sc.nextInt();
		Set<Dept> s=null;
			if(ch==1)
			s=new TreeSet<Dept>(new SortByName());		
			else
			s=new TreeSet<Dept>(new SortBySalary());
			
		s.add(new Dept("c",2000));
		s.add(new Dept("d",1200));
		s.add(new Dept("e",1800));
		s.add(new Dept("f",1400));
		s.add(new Dept("g",1500));
		System.out.println(s);
		
	}

}
