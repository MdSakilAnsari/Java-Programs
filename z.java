class x
{
	void show()
	{
		System.out.print("\nHello");
	}
}
class y extends x
{
	void disp()
	{
		System.out.print("_World");
	}
}
class z
{
 public static void main(String args[])
  {
    y a=new y();
    a.show();
     a.disp();
   }
}