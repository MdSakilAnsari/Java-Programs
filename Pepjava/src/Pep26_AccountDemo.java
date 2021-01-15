//To make a method synchronize use synchronized key word before data type.
//Synchronization can work only on same object or static synchronized method.
//We can make synchronized block by synchronized(this){}.
//Every thing written inside the synchronized block will be locked.
class Account implements Runnable
{
	int balance=11000;
	
	public void withdraw(String name,int amt)
	{
		synchronized(this) {
			if(amt<balance)
			{
				System.out.println(name+" is going to withdraw."+amt);
				balance-=amt;
				System.out.println("Available balance is "+name+"="+balance);
			}
			else
			{
				System.out.println(name+" has ony balance "+balance);
			}
		}
		System.out.println("Transaction complete successfully.... for."+name);
		
	}
	public void run()
	{
		withdraw(Thread.currentThread().getName(),5000);
	}
	
}
public class Pep26_AccountDemo {

	public static void main(String[] args) {
		Account ac=new Account();
		Thread t=new Thread(ac,"ATM");
		Thread t1=new Thread(ac,"BANKING");
		Thread t2=new Thread(ac,"CHAQUE");
		t.start();
		t1.start();
		t2.start();

	}

}
