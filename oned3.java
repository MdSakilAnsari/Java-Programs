//To accept N number given by user and arrange in ascending order.
import java.util.*;
class oned3
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("\nEnter number of term:\t");
  int x=s.nextInt();
  int a[]=new int[x];
  for(int i=0;i<x;i++)
  {
   System.out.print("\nEnter data for array:\t");
   a[i]=s.nextInt();
  }
  System.out.print("\nElement of array:\t ");
  for(int i=0;i<x;i++)
  {
   System.out.print(a[i]+" ");
  }
  for(int i=0;i<x;i++)
  {
   for(int j=i+1;j<x;j++)
    { 
     if(a[i]>a[j])
     {
      int t=a[i];
      a[i]=a[j];
      a[j]=t;
     }
    }
  }
  System.out.print("\nAfter shorting:\t\t");
  for(int i=0;i<x;i++)
  {
   System.out.print(a[i]+" ");
  }
 }
}