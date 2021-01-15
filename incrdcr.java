import java.util.*;
class incrdcr
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("\nEnter first number:\t");
  int a=s.nextInt();
  System.out.print("\nEnter second number:\t");
  int b=s.nextInt();
  for(int i=0;i<5;i++)
   {
       System.out.print("\nAfter post increment:\t"+ ++a);
   } 
 
  for(int j=0;j<5;j++)
   {
     System.out.print("\nAfter pre increment:\t"+b++);
   }
  
}
}