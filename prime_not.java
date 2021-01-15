import java.util.*;
class prime_not
{
  public static void main(String args[])
  {  
      int t=1;
Scanner s=new Scanner(System.in);
System.out.print("\nEnter Starting point:\t");
int start=s.nextInt();
System.out.print("\nEnter ending point:\t");
int ending=s.nextInt();
     while(start<ending)
     {	int i=2;
	while(i<start)
	{ 
    	 	if(start %i==0)
       		{
        		 t=0;
       		}
		if(t==1)
      		{
                 		System.out.print(start);
     		}
	i++;
	}
        start++;
       }

   }
}
