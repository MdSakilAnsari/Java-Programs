
public class Wrap_overload {
	public void go(short s)
	{
		System.out.println("Short");		
	}

	public void go(int s)
	{
		System.out.println("Integer");
	}
	public void go(long s)
	{
		System.out.println("Long");	
	}

	public void go(Long s)
	{
		System.out.println("Long_Wrapper");	
	}
	public void go(String s)
	{
		System.out.println("String_Class");	
	}
	
	public static void main(String[] args) {
		Wrap_overload wo=new Wrap_overload();
		byte a=12;
		int b=120;
		long c=4352;
		wo.go(a);
		wo.go(b);
		wo.go(c);

	}

}
