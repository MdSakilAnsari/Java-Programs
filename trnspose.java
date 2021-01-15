import java.util.*;
class transpose
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   System.out.print("\nEnter elements for array:");
   int a[][]=new int[3][3];
   for(int i=0;i<3;i++)
   {
    for(int j=0;j<3;j++)
    {
      a[i][j]=s.nextInt();
      System.out.print("\t");
    }
   System.out.print("\n");
  }
System.out.print("\nElement of array:\t");
     for(int i=0;i<3;i++)
     {
       for(int j=0;j<3;j++)
       {
        System.out.print(a[i][j]+"\t");
       }
      System.out.print("\n");
     }
  }
}