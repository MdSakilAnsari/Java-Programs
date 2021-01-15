import java.util.*;
class logic
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("\nEnter first number:\t");
  int a=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int b=s.nextInt();
  System.out.print("\nEnter third number:\t");
  int c=s.nextInt();
 	if(a>b && a>c)
	System.out.print("\nNumber A is big:\t"+a);
	else if(b>c)
	System.out.print("\n Number B is big:\t"+b);
	else
	System.out.print("\n Number c is big:\t"+c);
  System.out.print("\nEnter first number:\t");
  int p=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int q=s.nextInt();
  System.out.print("\nEnter third number:\t");
  int r=s.nextInt();
 	if(p>q ||p>r )
	System.out.print("\nHello:\t");
	else 
	System.out.print("\n world:\t");
 
}	
}