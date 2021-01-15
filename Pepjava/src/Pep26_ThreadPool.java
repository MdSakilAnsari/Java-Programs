import java.util.concurrent.ExecutorService;

//Benefit of thread pool-->It is a place where thread are staying after completion of work.
//Whenever need to use thread rather than creating new thread use thread pool for accessing the thread.
//It occupy fixed space 
/*
 * 							Thread pool
 * 								|
 * 	  --------------------------------------------------------------
 * 		|						|								|
 *	 fixed thread 			single thread 				cache thread pool
 *Fixed thread--> It have fixed size for storage of thread.
 *Cache thread--> pool increase the pool size when new thread comes in the pool but once size is increase can't decrease if thread gone.
 *
 */
class Demo implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is Running");
	}
}


public class Pep26_ThreadPool {

	public static void main(String[] args) {
		//ExecutorService ex=new Executors.new
		for(int i=0;i<50;i++)
		{
			
		}

	}

}
