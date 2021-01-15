import java.util.*;
class rect
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter length of rectangular");
  int l=s.nextInt();
  System.out.println("\nEnter Width of rectangular");
  int b=s.nextInt();
  int area=l*b;
  int p=2*(l+b);
  System.out.println("\nLength is=\t"+l+"\nWidth is=\t"+b);
  System.out.println("\nArea of rectangular is ="+area);
  System.out.println("\nLength is=\t"+l+"\nWidth is=\t"+b);
  System.out.println("\nParameter of rectangular is ="+p);
}
}