import java.util.*;
class student
{
 int roll_no;
 int mark2;
 int mark1;
 int mark3;
   student()
   {
    roll_no=1234;
    mark1=00;
    mark2=00;
    mark3=00;
   }
   Scanner s=new Scanner(System.in);
   void input()
   {
    System.out.print("\nEnter Roll number :\t");
    roll_no=s.nextInt();
    System.out.print("\nEnter Mark for paper 1:\t");
    mark1=s.nextInt();
    System.out.print("\nEnter Mark for paper 2:\t");
    mark2=s.nextInt();
    System.out.print("\nEnter mark for paper 3:\t");
    mark3=s.nextInt();
   }
   void avg()
   {
    System.out.print("\nAverage of given mark:\t");
    int av=(mark1+mark2+mark3)/3;
    System.out.print(av);
   }
   void display()
   {
    System.out.print("\nMark for paper 1:\t"+mark1);
    System.out.print("\nMark for paper 2:\t"+mark2);
    System.out.print("\nMark for paper 3:\t"+mark3);
   }
 }
class pstudent
{
 public static void main(String args[])
 {
  student s=new student();
  s.input();         
  s.avg();
  s.display();
 }
}


    
    
    
    
    