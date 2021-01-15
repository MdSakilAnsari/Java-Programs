import java.util.*;
interface my
{
 public void disp();
}
class meer implements my
{
void hello()
{
  Scanner s =new Scanner(System.in);
  System.out.print("\nEnter a number");
  int a=s.nextInt();
  for(int i=0;i<a;i++)
  {
    System.out.print("\nhello world");
   }
}
  public void disp()
 {
  System.out.print("\nMy name is sakil");
 }

}

class rohit1
{ 
public static void main(String args[])
{
meer m=new meer();
m.hello();
m.disp();
}
}