import java.util.*;
 interface multi
{ int a;
  int b;
  int c;
  void sum();
}
interface multi1
{
 int p;
 int q;
 int r;
void sub();
}
interface multi2
{ int x;
  int y;
  int z;
  void mult();
}
class calculate implements multi,multi1,multi2
{
 Scanner s=new Scanner(System.in)
 public void sum()
 {
  System.out.print("\nEnter inputs for addition:");
  System.out.print("\nEnter first numbar:\t");
  a=s.nextInt();
  System.out.print("\nEnter second number:\t");
  b=s.nextInt();
  c=a+b;
  System.out.print("\n Sum of A and B is="+c);
 }
 public void sub()
 {
  System.out.print("\nEnter inputs for subtraction:");
  System.out.print("\nEnter first numbar:\t");
  p=s.nextInt();
  System.out.print("\nEnter second number:\t");
  q=s.nextInt();
  r=p-q;
  System.out.print("\n Sub of P and Q is="+r);
 }
 public void mult()
 {
  System.out.print("\nEnter inputs for multiplication:");
  System.out.print("\nEnter first numbar:\t");
  x=s.nextInt();
  System.out.print("\nEnter second number:\t");
  y=s.nextInt();
  z=x*y;
  System.out.print("\n Mult of X and Y is="+z);
 }
}
class main_method
{
 public static void main()
 { 
  calculate m=new calculate();
  m.sum();
  m.sub();
  m.mult();
 }
}