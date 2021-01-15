class thread1 extends Thread
{
	public void run()
	{
	  for(int a=0;a<6;a++)
	   {
	     System.out.print("\nHello");
	  //  if(a==4)
                          //stop( );
                        }
	}
}
class thread2 extends Thread
{
	public void run()
	{
	  for(int b=0;b<6;b++)
	   {
	     System.out.print("\nsakil");
	   //  if(b==2)
                          // stop()
                        }
	}
}

class thread3 extends Thread
{
	public void run()
	{
	  System.out.print("\nGood morning");
	}
}
class my_n
{ 
 public static void main(String args[])
  {
    thread1 t=new thread1();
    thread2 u=new thread2(); 
    thread3 v=new thread3();
    t.start();
    u.start();  v.start();
    u.setPriority(Thread.MIN_PRIORITY);
     t.setPriority(Thread.MAX_PRIORITY);
  }
}

