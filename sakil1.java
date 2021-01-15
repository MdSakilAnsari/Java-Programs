//Uses of arithmetic operator in java.
import java.util.*;
class arith
{
 Scanner s=new Scanner(System.in);
 void sum()
 { 
  System.out.print("\nEnter Number for Addition ooeration\n");
  System.out.print("\nEnter first Number:\t");
  int a=s.nextInt();
  System.out.print("\nEnter Second Number:\t");
  int b=s.nextInt();
  int c=a+b;
  System.out.print("\nSum of A and B="+c);
 }
}
class sakil1
{
 public static void main(String args[])
 {
   arith a=new arith();
   a.sum();
 }
}