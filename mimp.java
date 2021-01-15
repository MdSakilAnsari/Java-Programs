interface m
{
  void disp();
}
interface b
{
void out();
} 
interface n extends b
{
void show();
}
class x implements m,n
{
 public void disp()
  {
   System.out.print("\nInterface 1 Executed");
  }
  public void show()
  {
  System.out.print("\n Interface 2 Executed");
  } 
  public void out()
  {
  System.out.print("\n Interface B Executed");
  }
}
class mimp
{
  public static void main(String args[])
  {
   x ne=new x();
   ne.show();
   ne.disp();
   ne.out();
  }
}