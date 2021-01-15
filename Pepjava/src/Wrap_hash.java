class Employee2
{
	String name;
	public Employee2(String name) {
		this.name = name;
	}
	public int hashCode()
	{
		return name.length();
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Employee2 && this.name==((Employee2)obj).name)
			return true;
		else
			return false;

	}
}

public class Wrap_hash {

	public static void main(String[] args) {
		Employee2 emp=new Employee2("Sakil_a");
		Employee2 emp2=new Employee2("Sakil");
		
		// TODO Auto-generated method stub
		System.out.println(emp);	
		System.out.println(emp2);	

		System.out.println(emp.equals(emp2));	

	}

}
