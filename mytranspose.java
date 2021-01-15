import java.util.*;
class matric1 
{
  Scanner s= new Scanner(System.in);
  int arr[][]=new int[3][3];
     void getmatric()
     {
	System.out.print("\nEnter Element of Array A\n");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)	
	{
	arr[i][j]=s.nextInt();
	}
	System.out.print("\n");
	}
    }
    void showmatric()
    {
	System.out.println("\nElement of Array A");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)	
	{
	System.out.print(arr[i][j]+"\t");
	}
	System.out.print("\n");
	}
   }
   void transpose()
   {
    System.out.println("\nElement of Array A in Transpose Order\n");
	for(int j=0;j<3;j++)
	{
		for(int i=0;i<3;i++)	
		{
		System.out.print(arr[i][j]+"\t");
		}
		System.out.print("\n");
	}
   }
}
class mytranspose
{
  public static void main(String args[])
   {
   matric1 m=new matric1();
   m.getmatric();
   m.showmatric();
   m.transpose();
   }
}
