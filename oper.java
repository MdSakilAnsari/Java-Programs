//import java.util.*;
class oper
{
 public static void main(String args[])
 {
  //Scanner s=new Scanner(System.in);
  System.out.println("\nUse of arithmetic operator");
  int x=9;int y=10;
  System.out.println("\nx=9 and y=10");
  System.out.println("\nExpression is :m=x+--y");
  int m=x+--y;
  System.out.println("\nm="+m);
  x=9;y=10;
  System.out.println("\nx=9 and y=10");
  System.out.println("\nExpression is :n=--y-y--");
  int n=--y-y--;
  System.out.println("\nn="+n);
  x=9;y=10;
  System.out.println("\nx=9 and y=10");
  System.out.println("\nExpression is :k=x+++y++");
  int k=x+++y++;
  System.out.println("\nk="+k);
  x=9;y=10;
  System.out.println("\nx=9 and y=10");
  System.out.println("\nExpression is p=--x+--y");
  int p=--x+--y; 
  System.out.println("\np="+p);
  x=9;y=10;
  System.out.println("\nx=9 and y=10");
  System.out.println("\nExpression is :q=y++*y-- ");
  int q=y++*y--;
  System.out.println("\nq="+q);
 }
}