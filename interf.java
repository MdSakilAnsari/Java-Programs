interface x
{
	void show();	
}
interface s
{
	int p=20;
	int q=30;
	void out();
}
interface z
{
	void disp();
	void print();
}
class y implements x,s,z
{
	public void show()
	{
		System.out.print("\nInterface executed");
	}
	public void out()
	{
		int t=p+q;
		System.out.print("\nSum="+t);
	}
	public void disp()
	{
		System.out.print("\nCr eated by Sakil");
	}
	public void print()
	{
		System.out.print("\nB.C.A part 3");
	}
}
class interf
{
 public static void main(String args[])
  {
    y a=new y();
    a.show();
     a.out();
     a.disp();
     a.print();
   }
}