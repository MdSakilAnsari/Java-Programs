import java.util.HashSet;
import java.util.Set;
class Emplo
{
	private String name;
	public Emplo(String name)
	{
		this.name=name;
	}
	public int hashCode()
	{
		return name.length();
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Emplo && this.name==((Emplo)obj).name)
		return true;
		else
		return false;	
	}
	public String toString()
	{
		return name;
	}
}

public class Pep21_Set {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(new Emplo("A"));
		s.add(new String("X"));
		s.add(new Emplo("AB"));
		s.add(new String("X"));
		System.out.print(s);
		
	}

}
