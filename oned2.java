//To accept N number in singly array and count how many even or odd number.
import java.util.*;
class oned2
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
  int count=0;int odd=0;
  for(int i=0;i<x;i++)
  { 
    if(a[i]%2==0)
      count=count+1;
    else
      odd=odd+1;
  }
  System.out.print("\nNumber of even element is=\t"+count);
  System.out.print("\nNumber of odd element is=\t"+odd);
 }
}