import java.util.*;
class bubble
{
	public static void main(String args[])
	{
	int n,temp,i,j;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter number of integer element to short\n");
	n=s.nextInt();
 	int arr[]=new int[n];
	System.out.print("Enter"+n+ "integer\n");
	for(i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	for(i=0;i<(n-1);i++)
	{
		for(j=0;j<(n-1);j++)
		{
		if (arr[j]>arr[j+1])
		{
		temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
		}
		}
	}
	System.out.print("Element after sorting\n");
	for(i=0;i<n;i++)
	{
	System.out.print(arr[i]+"\t");
	}
}
}