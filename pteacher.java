import java.util.*;
class teacher
{
 int id;
 int basic;
 int da;
 int hra;
   teacher()
   {
    id=1234;
    basic=00;
    da=00;
    hra=00;
   }
   Scanner s=new Scanner(System.in);
   void input()
   {
    System.out.print("\nEnter id of teacher:\t");
    id=s.nextInt();
    System.out.print("\nEnter basic salary:\t");
    basic=s.nextInt();
    System.out.print("\nEnter da 10% of basic:\t");
    da=s.nextInt();
    System.out.print("\nEnter hra 15%of basic:\t");
    hra=s.nextInt();
   }
   void calculate()
   {
    System.out.print("\nSum of total salary=:\t");
    int sum=basic+da+hra;
    System.out.print(sum);
   }
   void display()
   {
    System.out.print("\nBasic :\t"+basic);
    System.out.print("\nDA:\t"+da);
    System.out.print("\nHRA:\t"+hra);
   }
 }
class pteacher
{
 public static void main(String args[])
 {
  teacher s=new teacher();
  s.input();         
  s.calculate();
  s.display();
 }
}


          
    
    
    
    