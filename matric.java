import java.util.*;
class mat1
{
 Scanner s=new Scanner(System.in);
void matr()
{ 
   int arr[][]=new int[3][3];
   System.out.print("\nEnter value for matric 1:\t");
   for(int i=0;i<3;i++)
   { 
      for(int j=0;j<3;j++)
      {
       arr[i][j]=s.nextInt();System.out.print("\t");
      } 
     System.out.print("\n");
   }System.out.print("\tOutput\t");
    for(int i=0;i<3;i++)
   { 
      for(int j=0;j<3;j++)
      {
       System.out.print("\t"+arr[i][j]);
      } 
   System.out.print("\n");
}
 }
}
class mat2
{
   void mat()
 {
    Scanner s=new Scanner(System.in);
   int arr1[][]=new int[3][3]; 
   System.out.print("\nEnter value for matric 2:\t");
   for(int i=0;i<3;i++)
   { 
     for(int j=0;j<3;j++)
      {
       arr1[i][j]=s.nextInt(); 
       System.out.print("\t");
      } 
   }System.out.print("\n");
 }
}
class matric
{
  public static void  main(String args[])
  {
     mat1 m=new mat1();
     mat2 n=new mat2();
     m.matr();
     n.mat();
  }
} 