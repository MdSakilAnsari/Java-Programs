import java.util.*;
class bina
{
	public static void main(String args[])
	{
		
		int a[]=new int[5];
	  int i=0, k,n=19;
	  while(n>0)
	  {
		a[i]=n%2;
		i++;
		n=n/2;
	  }
	  for(k=4;k>=0;k--)
	  {
		System.out.print(a[k]);
	  }
	}
	
}
