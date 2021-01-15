import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Map is commonly used to store key and value.
//keys must be unique in the whole in the scope.
//Before inserting data in the map we have to make a check for confirmation of duplicate elements.
//It will override the existing data if any found by new one
// Map is not a part of collection but it comes in the category of collection.
//It will not use any heirarchy of collection.
/*
 * 						Map
 * 						|
 * --------------------------------------------------
	/					|				|			\	
 	hash map	linked hash map		Tree map	Hash table
 					
 					
 Tree map--->	 Tree map is a shorted map it will short the data by keys values.
 Hash table--->	Hash table is thread safe it is used only for thread security.
 SubMap--->	It don't have own memory.
 Concurrent hash map--->	Concurrent Hash map is used at the place of Hash map.
 It will lock only those data rather than locking whole bucket.
 
 *
 */
public class Pep24_map {

	public static void main(String[] args) {
		//Map<String, String> m=new HashMap<String, String>();//It can be non-generic type.For accessing this value use(Object o:m.keySet())
		TreeMap<Integer, String> m=new TreeMap<Integer, String>();
		m.put(16, "Sakil");
		m.put(19, "Wakil");
		m.put(13, "Gakil");
		m.put(15, "Hakil");
		m.put(17, "Makil");
		
		Map<Integer,String> m1=m.subMap(1, 30);
		System.out.println(m1);
		System.out.println(m);
		m.put(29,"Elephant");
		System.out.println(m1);
		System.out.println(m);
		m.put(35,"Ant");
		System.out.println("=====================");
		System.out.println(m1);
		System.out.println(m);
		
		
		
		System.out.println(m.get(1));//It will return value of key "A".
		
		
		for(Integer s:m.keySet())	//Accessing of map value using keys.
			System.out.println(m.get(s));
		
		if(m.containsKey("19"))//It is use to check keys is exist or not.
		{
			System.out.println("Keys already exists");
		}
		else
		{
			System.out.println("Value added");
		}
		
	}

}
