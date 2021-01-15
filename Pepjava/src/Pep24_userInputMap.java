import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pep24_userInputMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(101,"Abhishek");
		m.put(102,"Sanu");
		m.put(103,"Ankush");
		m.put(104,"Sakil");
		m.put(105,"Joshi");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter User ID");
		int id=s.nextInt();
		
		System.out.println("Enter User Name");
		String name=s.next();
		
		if(m.containsKey(id))
		{
			if(name.equals(m.get(id)))
			{
				System.out.println("User Exists...Welcome!!! ");	
			}
			else
			{
				System.out.println("Sorry User_name error..");	
			}
		}
		else
		{
			System.out.println("Sorry user_Id Doesn't exists..");	
		}
		
	}

}
