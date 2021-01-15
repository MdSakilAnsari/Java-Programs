import java.util.*;
class arith
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("\nEnter first number:\t");
  int a=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int b=s.nextInt();
  int c=a+b;
  System.out.print("\nSummation=\t"+c);
 System.out.print("\nEnter first number:\t");
  int p=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int q=s.nextInt();
  int r=p-q;
  System.out.print("\nSubtraction=\t"+r);
 System.out.print("\nEnter first number:\t");
  int x=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int y=s.nextInt();
  int z=x*y;
  System.out.print("\nMultiplication=\t"+z);
 System.out.print("\nEnter first number:\t");
  int i=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int j=s.nextInt();
  int k=i/j;
  System.out.print("\nDivision=\t"+k); 
  System.out.print("\nEnter first number:\t");
  int m=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int n=s.nextInt();
  int o=m%n;
  System.out.print("\nModular=\t"+o);
}
}
