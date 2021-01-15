import java.util.*;
class swap
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter number to perform swap operation");
  System.out.println("\nEnter first number:\t");
  int a=s.nextInt();
  System.out.println("\nEnter second number:\t");
  int b=s.nextInt();
  System.out.println("\nUsing third variable"); 
  System.out.println("\nBefore Swaping \n a="+a+"\n b="+b);
  int c=a;
      a=b;
      b=c;
  System.out.println("\nAfter Swaping \n a="+a+"\n b="+b);
  System.out.println("\nWithout Using third variable"); 
  System.out.println("\nEnter first number:\t");
  int x=s.nextInt();
  System.out.println("\nEnter second number:\t");
  int y=s.nextInt();
  System.out.println("\nBefore Swaping \n x="+x+"\n y="+y);
  x=x+y;
  y=x-y;
  x=x-y;
  System.out.println("\nAfter Swaping \n x="+x+"\n y="+y);
 }
}