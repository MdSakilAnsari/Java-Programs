import java.util.PriorityQueue;
import java.util.Queue;

public class Pep22_Queue {

	public static void main(String[] args) {
	Queue<String> q=new PriorityQueue<String>();
	q.add("A");
	q.add("B");
	q.add("D");
	q.add("F");
	q.add("C");
	q.add("H");
	q.offer("Akil");
	q.offer("Ankush");
	System.out.println(q);
	System.out.println(q.size());
	System.out.println(q.peek());
	System.out.println(q.peek());
	System.out.println(q.size());
	System.out.println(q.poll());//It will print the element from front and remove it.
	System.out.println(q);
	System.out.println(q.size());
	
	}

}
