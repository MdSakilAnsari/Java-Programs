import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pep21_Generic {
	public void display(List<String> li)
	{
		li.add("Sakil");
		li.add("Abhishek");
		System.out.println(li);
	}

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(14);
		li.add(false);
		li.add(13.23); 
		Pep21_Generic p=new Pep21_Generic();
		p.display(li);
	}
}