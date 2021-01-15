//Uses of relational oerator and logical operator with conditional statement;
import java.util.*;
class relate
{ 
 Scanner s=new Scanner();
 void ger()
 {
  Sytem.out.print("\nEner three number and check which is larger");
  Sytem.out.print("\nEnter number one by one:\t");
  int a=s.nextInt();
  int b=s.nextInt();
  int c=s.nextInt();
  if(a>b) && (a>c)
  {  
    Sytem.out.print("\nFirst Number is big:\t"+a);
  }
  else if(b>c)
  {
    Sytem.out.print("\nSecond Number is big:\t"+b);
  }
  else
  {
    Sytem.out.print("\nThird Number is big:\t"+c);
  }
 }
 void les()
 {
  Sytem.out.print("\nEner three number and check which is smallest");
  Sytem.out.print("\nEnter number one by one:\t");
  int d=s.nextInt();
  int e=s.nextInt();
  int f=s.nextInt();
  if(d<e)&&(d<f)
  {  
    Sytem.out.print("\nFirst Number is small:\t"+d);
  }
  else if(e<f)
  {
    Sytem.out.print("\nSecond Number is small:\t"+e);
  }
  else
  {
    Sytem.out.print("\nThird Number is small:\t"+f);
  }
 }
}
class condi
{ 
 public static void main(String args[])                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
 { 
  relate r=new relate();
  r.ger();
  r.les();
 }
}
 