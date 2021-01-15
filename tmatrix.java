import java.util.*;
class tmatrix
{
public static void main(String args[])
{
 int arr1[][]=new int[3][3];
 Scanner s=new Scanner(System.in);
 System.out.print("\n Enter Element for a Matrix");
 for(int i=0;i<3;i++)
 {
	for(int j=0;j<3;j++)
	{
	arr1[i][j]=s.nextInt();System.out.print("\t ");
	} 
System.out.print("\n ");
}
System.out.print("\nElement for a Matrix\n");
for(int i=0;i<3;i++)
{
	for (int j=0;j<3;j++)
	{
	System.out.print(arr1[i][j]);
	System.out.print("\t ");
	}
System.out.print("\n ");
}
System.out.print("\nTranspose of a Matrix\n");
for(int j=0;j<3;j++)
{
	for (int i=0;i<3;i++)
	{
	System.out.print(arr1[i][j]);System.out.print("\t ");
	}	
System.out.print("\n ");
}
}
}