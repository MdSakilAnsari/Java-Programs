import java.util.ArrayList;
import java.util.List;

public class Pep20_Generic {

	public static void main(String[] args) {
		//Generic is use to make type safe.
		List<String> li=new ArrayList<String>();
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");
			System.out.println(li);
		li.remove(2);
		li.remove("D");
		System.out.println(li);
		
		List<Integer> i=new ArrayList<Integer>();//Generic type can't be premittive type.
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
			System.out.println(i);
		i.remove(2);
		//By default it remove from index if found other wise it gives IndexOutOfBoundException only in case of Integer..
			System.out.println(i);
		
		
		List<Integer> i1=new ArrayList<Integer>();
		i1.add(1);
		i1.add(2);
		i1.add(9);
		i1.add(6);
		i1.add(5);
		
			//i.removeAll(i);
		System.out.println("All deleted");
		
		System.out.println(i.retainAll(i1));
		
		System.out.println("All retained");
		System.out.println(i);
		//Using Iterator.
		List<Integer> it=new ArrayList<Integer>();
		it.add(1);
		it.add(2);
		it.add(9);
		it.add(6);
		it.add(5);
		System.out.println(it.size());
		for(int x=0;x<it.size();x++)
		{
			it.remove(x);	
		}
		System.out.println(it.size());
		
		
		
		
		
		
	}

}
