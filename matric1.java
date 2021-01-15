import java.util.*;
class matric1 
{
	public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	int arr[][]=new int[3][3];
	System.out.print("\nEnter Element of Array A");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)	
	{
	arr[i][j]=s.nextInt();
	}
	}
	System.out.println("\nElement of Array A");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)	
	{
	System.out.print(arr[i][j]);
	}
	System.out.print("\n");
	}
}
}