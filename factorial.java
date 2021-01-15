import java.util.*;
public class factorial
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.print("\nEnter a number:\t");
    int n=s.nextInt();
    int t=n;
    for(int i=2;i<t;i++)
    {
      n=n*i;   
    }
    System.out.print("\nFactorial of given number:\t"+n);
   }
 }
