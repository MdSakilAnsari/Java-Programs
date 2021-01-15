
public class Wrapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="10";
		String str2="20";
		System.out.println(str+str2);
		
		Integer a=new Integer(str);
		Integer b=new Integer(str2);
		System.out.println(a+b);//In case of adding two premittive type value both must be same.
		
		Boolean bo=new Boolean("TRUE");
		System.out.println(bo);
	
		//It will print false in all case because it will print default value of Boolean, except true as arguments.
		Boolean bo1=new Boolean("TRUEEE");
		System.out.println(bo1);
		
		//After java-5 java support direct conversion premittive to wrapper class.
		Integer x=200;
		Integer y=200;
		System.out.println(x+y);
		
		//return false it will return true when value=100
		//Integer literal wrapper class int char short byte.
		//== operator is use to compare between premittive type 
		System.out.println(x==y);
		
		//Before java-5 version was only this way to perform autoboxing operation .
		Integer x1=new Integer(10);
		Integer y1=new Integer(10);
		System.out.println(x1.valueOf(x1)+y1.valueOf(y1));	
	}
}
