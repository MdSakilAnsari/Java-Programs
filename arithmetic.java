import java.util.*;
class arithm
{
   Scanner s=new Scanner(System.in);  
   void sum()
   {
    System.out.println("Please give input for Addition operation:");
    System.out.print("Enter first number:\t");
    int a=s.nextInt();
    System.out.print("Enter second number:\t");
    int b=s.nextInt();
    int c=a+b; 
    System.out.println("\n Add of first and second="+c);
   }
   void sub()
   {
    System.out.println("Please give input for Subtraction operation:");
    System.out.print("Enter first number:\t");
    int d=s.nextInt();
    System.out.print("Enter second number:\t");
    int e=s.nextInt();
    int f=d-e;
    System.out.println("\nSub of first and second="+f);
   }
   void mul()
   {
    System.out.println("Please give input for Multiplication operation:");
    System.out.print("Enter first number:\t");
    int g=s.nextInt();
    System.out.print("Enter second number:\t");
    int h=s.nextInt(); 
    int i=g*h;
    System.out.println("\nMult of first and second="+i);
   }
   void div()
   {
    System.out.println("Please give input for Division operation:");
    System.out.print("Enter first number:\t");
    int j=s.nextInt();
    System.out.print("Enter second number:\t");
    int k=s.nextInt(); 
    int l=j/k;
    System.out.println("\nDiv of first and second="+l); 
   }
   void mod()
   {
    System.out.println("Please give input for Modulas operation:");
    System.out.print("Enter first number:\t");
    int m=s.nextInt();
    System.out.print("Enter second number:\t");
    int n=s.nextInt(); 
    int o=m%n;
    System.out.println("\nModulas of first and second="+o); 
    }
} 
 class arithmetic
{
  public static void main(String args[])
  {
   arithm a=new arithm();
   a.sum();
   a.sub();
   a.mul();
   a.div();
   a.mod();
  }
}