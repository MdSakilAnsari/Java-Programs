import java.util.*;
class option
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	sakil sa=new sakil();
	System.out.print("\nAvailable option\n================\n");
	System.out.print("\nPress 1 for addition.");
	System.out.print("\nPress 2 for subtraction.");
	System.out.print("\nPress 3 for multiplication.");
	System.out.print("\nPress 4 for division.\n");
	System.out.print("\nYour option\n================\n");
	int n=s.nextInt();
	System.out.print("\n=================");
	if(n==1 )
	{
	sa.add();
	}
	else if(n==2)
	{
	sa.sub();
	}
	else if(n==3)
	{
	sa.mul();
	}
	else if(n==4)
	{
	sa.div();
	}
	else
	{
	System.out.print("Try again\n");
	}
	}

}
class sakil
{
	Scanner s=new Scanner(System.in);
	void add()
	{
	System.out.print("\nEnter 1st no\t");
	int n1=s.nextInt();
	System.out.print("\nEnter 2nd no:\t");
	int n2=s.nextInt();
	int sum=n1+n2;
	System.out.print("\nTotal of sum:\t"+sum);
	}
	void sub()
	{
	System.out.print("\nEnter 1st no:\t");
	int o1=s.nextInt();
	System.out.print("\nEnter 2nd no:\t");
	int o2=s.nextInt();
	int subt=o1-o2;
	System.out.print("\nTotal of subtraction:\t"+subt);
	}
	void mul()
	{
	System.out.print("\nEnter 1st no:\t");
	int p1=s.nextInt();
	System.out.print("\nEnter 2nd no:\t");
	int p2=s.nextInt();
	int mult=p1*p2;
	System.out.print("\nTotal of multiplication:\t"+mult);
	}
	void div()
	{
	System.out.print("\nEnter 1st number:\t");
	int q1=s.nextInt();
	System.out.print("\nEnter 2nd no:\t");
	int q2=s.nextInt();
	int di=q1/q2;
	System.out.print("\nTotal of division:\t"+di);
	}
}