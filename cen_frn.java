import java.util.*;
class cen_frn
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.print("\nEnter tempereture in centigrade:\t");
    int c=s.nextInt();
    int t=9*c;
    float f=(160+t)/5;
    System.out.print("\nTemperature in fahrenheit:\t"+f);
  }
 }
