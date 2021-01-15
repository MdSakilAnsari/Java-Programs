interface x
{
	void show();
}
class s implements x
{	
	public void show()
	{
		System.out.print("\nInterface executed");
	}
	int p=20;
	int q=30;
	public void out()
	{
		int t=p+q;
		System.out.print("\nSum="+t);
	}
}
class z extends s
{
	
	 void disp()
	{
		System.out.print("\nCr eated by Sakil");
	}
}
class multi
{
 public static void main(String args[])
  {
    z a=new z();
    a.show();
     a.out();
     a.disp();
   }
}