import java.util.*;
class patt
{
public static void main(String args[]);
{
    /*Scanner s=new Scanner();
    int r=s.nextInt();
    int c=s.nextInt();*/
	for(int j=1,k=1,k<=5;k++,j+=3)
	{
	System.out.print("\t"+j);
	for(int x=1,y=2;x<3;x++,y+=2)
	{
	System.out.print("\t"+(j+y));
	}
}