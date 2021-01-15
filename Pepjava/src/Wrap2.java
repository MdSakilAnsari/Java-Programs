class Employee
{
	String name;

	public Employee(String name) {
		this.name = name;
	}
	public String toString()//Overriding the toSdtring() method
	{
		return name;
	}
	
}
public class Wrap2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Sakil");
		Employee emp=new Employee("Sakil_ji");
		System.out.println(str);
		//When you print the object then object class call toString() and print the Hash code of that class.
		//if you want to print he content of that class you must have to override the toString() method within class.
		System.out.println(emp);	

	}

}
