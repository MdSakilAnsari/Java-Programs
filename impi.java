interface admit
{
  int roll=201;
  int fee=1207;
 void admi();
}
class dep implements admit
{ 
    void exam()
   {
     System.out.print(" \nSubject=Math");
   }
   public void admi()
   { 
    System.out.print(" \nRoll="+roll+"\nFee="+fee);
   }
}
class impi
{
   public static void main(String args[])
    {
      dep s=new dep();
      s.exam();
      s.admi();
    }
}