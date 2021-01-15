interface sakil
{
  int a=12;
  int b=8;
 void sum();
}
class sakil1 implements sakil
{
   public  void sum()
   {
     int c=a+b;
     System.out.print("\nSum is ="+c);
   }
}
class impsakil
{
  public static void main(String args[])
   {
    sakil1 s=new sakil1();
    s.sum();
  }
}