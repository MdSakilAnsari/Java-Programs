import java.util.*;
class addition
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   System.out.print("\nEnter elements for array 1:\n");
   int a[][]=new int[3][3];
   for(int i=0;i<3;i++)
   {
    for(int j=0;j<3;j++)
    {
      System.out.print("\t");
      a[i][j]=s.nextInt();
    }
  }
 System.out.print("\nEnter elements for array 2:\n");
   int b[][]=new int[3][3];
   for(int i=0;i<3;i++)
   {
    for(int j=0;j<3;j++)
    {
      System.out.print("\t");
      b[i][j]=s.nextInt();
    }
  }
int c[][]=new int[3][3];
   for(int i=0;i<3;i++)
     {
       for(int j=0;j<3;j++)
         {
            c[i][j]=a[i][j]+b[i][j];
         }
    } 
 System.out.print("\nElements of array 1:\n");
     for(int i=0;i<3;i++)
     {
       for(int j=0;j<3;j++)
       {
        System.out.print(a[i][j]+"\t");
       }
      System.out.print("\n");
     }
  System.out.print("\nElements of array 2:\n");
     for(int i=0;i<3;i++)
     {
       for(int j=0;j<3;j++)
       {
        System.out.print(b[i][j]+"\t");
       }
      System.out.print("\n");
     }
  System.out.print("\nSum of matric:\n");
     for(int i=0;i<3;i++)
     {
       for(int j=0;j<3;j++)
       {
        System.out.print(c[i][j]+"\t");
       }
      System.out.print("\n");
     }
  }
}