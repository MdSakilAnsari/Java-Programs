import java.util.*;
class control
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   System.out.print("\nEnter number of entries:");
   int n=s.nextInt();
   System.out.print("\nHere series is 1+1/2+1/3+........+1/n"); 
   float p=0;
   for(int i=1;i<n;i++)
   {
    p=p+(1/i+1);
   }
    System.out.print("\nValue of Series is=\t"+p+1);
 }
}



    