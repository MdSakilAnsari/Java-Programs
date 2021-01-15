//To accept N number given by user and add each digits in singly array list.
import java.util.*;
class oned
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
   System.out.print(" ");
  }
  System.out.print("\nElement of array:\t");
  for(int i=0;i<x;i++)
  { 
    System.out.print(a[i]+" ");
  }
  int b=0;
  for(int i=0;i<x;i++)
  { 
    b=b+a[i];
  }
  System.out.print("\nSum of element is=\t"+b);
 }
}