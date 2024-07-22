package Pack1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListandHashSet {
	
	public static void main(String[] args) {
		
		HashSet hset = new HashSet();
		hset.add("Amol");       // addition
		hset.add("12334");
		hset.add(null);
		hset.add("Amol");
		hset.add("2024");
		
		//retrieval
		Iterator i = hset.iterator();
		for(Object e : hset)
		{
//			System.out.println(e);
//			or
			System.out.println(e);
		}
		System.out.println("------------------");
		hset.remove("2024");
		i = hset.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(66);  // addition
//		list.add(20); 
//		list.add(32);
//		list.add(66);
//		
//		for(int i=0; i<list.size(); i++)
//		{
//			System.out.println(list.get(i));    // get method retrieval
//		}
//		
//		System.out.println("----------------");
//		
//		list.remove(2);     // deletion
//		
//		for(Object e : list)
//		{
//			System.out.println(e);
//		}
		
	}
}
