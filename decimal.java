import java.util.*;
class decimal
{
  public static void  main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.print("\nEnter a number in rupees with decimal point:\t");
    float num=s.nextFloat();
    System.out.print("\nRupees in decimal point=\t"+num) ;
    float a=100;
    num=a*num;   
    System.out.print("\nRupees in paisa=\t"+num);
  }
} 