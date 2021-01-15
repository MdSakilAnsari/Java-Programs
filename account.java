import java.util.*;
class account
{
  public static void  main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.print("\nEnter price of goods:\t");
    float p=s.nextFloat();   
    System.out.print("\nEnter number of years:\t");
    int y=s.nextInt();
    System.out.print("\nEnter depritiation value in %:\t");
    int d=s.nextInt();
    for(int i=1;i<=y;i++)
    {
      p=p-((p*d)/100);
    }
    System.out.print("\n Salvage value of goods according to ngiven year=\t"+p);
  }
} 