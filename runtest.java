class runthread implements Runnable
{ 
	public void run()
	{
	for(int i=1;i<10;i++)
	 {
	System.out.print("\nRunnable thread executes\t:"+i);
	}
	System.out.print("\nEnd of thread :");
}
class runtest
{
  public static void main(String args[])
  {
	runthread runnable=new runthread();
	Thread t=new Thread(runnable);
	t.start();
	System.out.print("\nExit from main");
  }
}
