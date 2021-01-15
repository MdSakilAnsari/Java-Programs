 class x
{
  int a=10;
private int b=40;
void show()
 {
  System.out.print("\nb="+b);
 }
void sum()
 {
  System.out.print("\na+b="+(a+b));
 }
}
class xy extends x
{
  void put()
  {
   System.out.print("\n class xy");
  }
}
class impxy
{
 public static void main(String args[])
  {
   xy p=new xy();
   x q=new x();
   q.show();
   q.sum();
   p.sum();
  }
}