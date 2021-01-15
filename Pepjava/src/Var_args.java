
public class Var_args {
	public void display(String as[])
	{
		for(String s:as)
			System.out.println(s);
		
	}
	public void show(int add,String... as)
	{
		System.out.println(add);
		
		for(String s:as)
			System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var_args v=new Var_args();
		v.display(new String[] {"Abhi","Sakil","Sanu","Manoj"} );
		v.show(5,"Abhi","Sakil","Sanu","Manoj");
	}

}
