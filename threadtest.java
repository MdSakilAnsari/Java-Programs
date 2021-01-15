class a extends Thread
{	
	public void run()
	{
	for(int i=1;i<6;i++)
	 {
	  System.out.print("\n From class A :\t"+i);
	 }
	}
}
class b extends Thread
{	
	public void run()
	{
	for(int j=1;j<5;j++)
	 {
	  System.out.print("\n From class B :\t"+j);
	 }
	}
}
class c extends Thread
{	
	public void run()
	{
	for(int k=1;k<8;k++)
	 {
	  System.out.print("\n From class C :\t"+k);
	 }
	}
}
class threadtest
{
	public static void main(String args[])
	{
	a a1=new a();
	b b1=new b();
	c c1=new c();
	System.out.print("\nThread are running:");
	a1.run();
	b1.run();
	c1.run();
	System.out.print("\nThread is starting:");
	 a1.start();
	b1.start();
	c1.start();
	}
}