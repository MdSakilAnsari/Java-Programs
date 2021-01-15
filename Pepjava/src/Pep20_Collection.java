import java.util.ArrayList;
import java.util.List;
public class Pep20_Collection {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add("A");
		li.add(12);
		li.add(72.87);
		li.add(true);
		for(Object o:li)
		{
			if(o instanceof String)	
			{
				String str=(String)o;
				System.out.println(str);
			}
			if(o instanceof Integer)
			{
				int str=(Integer)o;
				System.out.println(str);
			}
			if(o instanceof Boolean)	
			{
				boolean str=(Boolean)o;
				System.out.println(str);
			}
			if(o instanceof Double)	
			{
				double str=(Double)o;
				System.out.println(str);
			}
		}

}
}
