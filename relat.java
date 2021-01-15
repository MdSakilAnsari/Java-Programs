import java.util.*;
class relat
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("\nEnter first number:\t");
  int a=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int b=s.nextInt();
 	if(a>b)
	System.out.print("\nNumber A is big:\t"+a);
	else
	System.out.print("\nNumber B is big:\t"+b);
  System.out.print("\nEnter first number:\t");
  int p=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int q=s.nextInt();
	if(p<q)
	System.out.print("\nNumber Q is big:\t"+q);
	else
	System.out.print("\nNumber P is big:\t"+p);
  System.out.print("\nEnter first number:\t");
  int x=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int y=s.nextInt();
	if(x==y)
	System.out.print("\nBoth Number  is equal:\t"+x+"="+y);
	else
	System.out.print("\nBoth Number is not equal:\t"+x+"!="+y);
}
}
