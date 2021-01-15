interface sakilji
{
 void sum();
}
class sakil1 implements sakilji
{
   public  void sum()
   {
     int c;int a=10; int b=20;
c=a+b;
     System.out.print("\nSum is ="+c);
   }
}
class imp
{
  public static void main(String args[])
   {
    sakil1 s=new sakil1();
    s.sum();
  }
}