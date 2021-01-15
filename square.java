import java.util.*;
class square
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("\nEnter side of square");
  int si=s.nextInt();
  int area=si*si;
  int p=4*(si);
  System.out.println("\nSide is=\t"+si);
  System.out.println("\nArea of square is ="+area);
  System.out.println("\nParameter of square is ="+p);
}
}