import java.util.*;
class pri_n
{
  public static void main(String args[])
  {  
	Scanner s=new Scanner(System.in);
	int start;
	int ending;
	System.out.print("Enter starting point\t");
	start=s.nextInt();
	System.out.print("Enter ending point\t");
	ending=s.nextInt();
  	int t=1;
	for(int i=start;i<ending;i++)
	{
       		for(int j=2;j<i;j++)
     	 	 { 
       	   	 if(i%j==0)
             		{
            	  	 t=0;
             		}
       	}
         	  if(t==1)
         	  {
          	   System.out.print(i+"\t");
	  }
	 if(t==1)
         	  {
	  }
	else
	{
	t=t+1;                                                                                                                                                                                                                          
	}
	}
    }
 }
