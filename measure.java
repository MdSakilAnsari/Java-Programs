import java.util.*;
class measure
{
	public static void main(String args[])
	{
	sakil sa=new sakil();
	sa.show();
	}
}
class sakil
{
	void show()
	{
	Scanner s=new Scanner(System.in);
	System.out.print("\nEnter rate:\t");
	int r=s.nextInt();
	System.out.print("\nEnter quatity:\t");
	int q=s.nextInt();
	int t=r*q;
	System.out.print("\nTotal amount:\t"+t);
	}
}