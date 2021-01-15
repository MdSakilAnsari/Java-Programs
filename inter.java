import java.util.*;
interface add
{ int a=0;
   int b=0;
   int c=0;
  void sum();
}
class impl implements add
{
  Scanner s=new Scanner(System.in);
  public void sum()
  {
    System.out.print("\nEnter number:");
    int x=s.nextInt();
    int y=s.nextInt();
    int z=x+y;
    System.out.print("\nSum is ="+z);
  }
}
class inter
{ 
 public static void main(String args[])
   { 
        impl i=new impl();
        i.sum();
   }
}