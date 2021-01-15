import java.util.ArrayList;
import java.util.List;

public class Pep25_ListRefrence {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("A");
		li.add("G");
		li.add("F");
		li.add("C");
		li.add("D");
		li.add("B");
		li.forEach(System.out::println);
	}

}
