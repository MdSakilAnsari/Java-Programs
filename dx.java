interface x
{ 
  void show();
}
class y implements x
{
 public void show()
 {
  System.out.print("\nInterface implements\n");
 }
}
class dx
{
  public static void main(String args[])
  {
   y d=new y();
   d.show();
  }
}