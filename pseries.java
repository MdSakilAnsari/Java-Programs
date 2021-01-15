class series
{
int a;int b;int c;
  series()
  {
   a=0;b=1;c=0;
  }
  void fibo()
  {
   System.out.print(a+"\t"+b+"\t");
   for(int i=0;i<8;i++)
   {
    c=a+b;
    System.out.print(c+"\t");
    a=b;
    b=c;
   }
  }
}
class pseries
{ 
 public static void main(String args[])
 { 
  series s=new series();
  s.fibo();
 }
}       

  