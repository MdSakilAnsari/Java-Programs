//initialiging value on member function or member variable using constructor passing parameter.
import java.util.*;
class sakil
{
  int area;
  int len;
  int wid;
  sakil(int x,int y)
  {
   len=x;
   wid=y;
   }
}
class access 
{
 public static void main(String args[])
 { 
   Scanner s=new Scanner(System.in);
  System.out.print("\nEnter length:\t");
   int p=s.nextInt();
 System.out.print("\nEnter width:\t");
   int q=s.nextInt();
      System.out.print("\nhello sakil");
      sakil b=new sakil(p,q);
      b.area=b.len*b.wid;
      System.out.print("Area="+b.area);
}
}