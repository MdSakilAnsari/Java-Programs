//By default each thread have same priority is called default priority[5];
class MyNewThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		   }
		catch(InterruptedException e) {
			System.out.println("Error->"+e);
		   }
	   }
} }

public class Pep26_Thread 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		MyNewThread t=new MyNewThread();
		Thread th1=new Thread(t,"THREAD2");
		Thread th2=new Thread(t,"THREAD3");
		Thread th3=new Thread(t,"THREAD4");
		th2.setPriority(6);
		th3.setPriority(9);
		th1.setPriority(7);//setPriority is used to set priority of thread but this priority is not for permanently OS can change at any level.
		th1.start();//start method is use to start run method of thread of thread class or run method of Runnable interface.
		th2.start();
		System.out.println(th2.getPriority());//To check level of priority of Thread.
		
		th2.join();//after complete execution of thread1 and thread2, thread3 will join the execution.
		th3.start();
		
		System.out.println(th1.isAlive());//isAlive method is use to check whether thread is under execution or not.
		System.out.println(th2.isAlive());
		
	}

}
