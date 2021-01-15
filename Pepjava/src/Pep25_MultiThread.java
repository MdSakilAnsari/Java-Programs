//Thread is a called light weight process.
//in any application have at least one thread.
//Thread is a class in java which comes under java.lang package.
//Thread is working concurrently because its fast execution.
//In term of multiple tasking each task have own memory.In this case context switching take more time.
/*
 * 						  Thread State
 * 								|
 * 	  -----------------------------------------------------------------
 * 		|					|					|					|			
 * New Thread		Not-Running				Running				Stop state
						|										|
			---------------------------			------------------------------
			/			|			\			/							\
		sleep()		Block			wait()		
 */
//Thread have disadvantage because many of thread can run concurrently without completion of first task.
import java.util.*;
class myThread extends Thread
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

	
	}
}

public class Pep25_MultiThread {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		myThread t=new myThread();
		t.run();//It will print main thread.And it is not implementing thread concept it is similar as normal method.
		t.start();
		myThread t2=new myThread();
		t2.start();
		
	}

}
