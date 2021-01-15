class imprun implements Runnable
{
	public void run()
	{
	int a=1;
	while(a<10)
	{
	System.out.println("Hello Sakil");
	}
	}
}
class imprunnable
{
 public static void main(String args[])
 {
imprun x= new imprun();
Thread t=new Thread(x);
t.run();
}
}