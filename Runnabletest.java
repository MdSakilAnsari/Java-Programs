class x implements Runnable
{ 
	public void run()
	{
	for(int i=1;i<10;i++)
	 {
	System.out.print("\nRunnable thread executes\t:"+i);
	}
	System.out.print("\nEnd of thread 1 :");
}
class y implements Runnable
{ 
	public void run()
	{
	for(int k=1;k<10;k++)
	 {
	System.out.print("\nRunnable thread executes\t:"+k);
	}
	System.out.print("\nEnd of thread 2:");
}
class Runnabletest
{
	public static void main(String args[])
  	{
	x runna=new x();
	y runn =new y();
	Thread thread1=new Thread(runna);
	Thread thread2=new Thread(runn);
	thread1.start();
	thread2.start();
	System.out.print("\nExit from main");
 	 }
}
