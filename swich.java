import java.util.*;
class swich
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);  
    System.out.println("Please enter a number between 1-7:");
    int a=s.nextInt(); 
  switch(a)
  {
   
    case 1:System.out.print("\nSunday");
                    break;
    case 2:System.out.print("\nMonday");
                    break;
    case 3:System.out.print("\nTuesday");
                    break;
    case 4:System.out.print("\nWednesday");
                    break;
    case 5:System.out.print("\nThursday");
                    break;
    case 6:System.out.print("\nFriday");
                    break;
    case 7:System.out.print("\nSaturday");
                    break;
    default:System.out.print("\nSorry:wrong entry");
                    break;
  }
 }
}
   