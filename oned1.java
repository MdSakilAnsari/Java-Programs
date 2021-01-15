//To accept N number given by user and find out its average value.
import java.util.*;
class oned1
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("\n Enter number of term:\t");
  int x=s.nextInt();
  int a[]=new int[x];
  for(int i=0;i<x;i++)
  {
   System.out.print("\nEnter data for array:\t");
   a[i]=s.nextInt();
   System.out.print(" ");
  }
  System.out.print("\nElement of array:\t");
  for(int i=0;i<x;i++)
  { 
    System.out.print(a[i]+" ");
  }
  int b=0;
  for(int i=0;i<5;i++)
  { 
    b=b+a[i];
  }
  System.out.print("\nSum of element is=\t"+b);
  int avg=b/x;
  System.out.print("\nAverage of element is=\t"+avg);
 }
}
 