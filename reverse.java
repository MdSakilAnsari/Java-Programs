import java.util.*;
class reverse
{
  	public static void main(String args[])
  	{  
	int r=0;int d=0;
    	Scanner s=new Scanner(System.in);
    System.out.print("\nEnter a number:\t");
    int n=s.nextInt();
    while(n>0)
    {
      r=n%10;
     d=d*10+r;
     n=n/10;
     }
    System.out.print("\nReverse of given number:\t"+d);
    }
 }
