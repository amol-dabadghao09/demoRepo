package Pack1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Hashtable123 {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(12, "String1");
		map.put(15, "amol");
		map.put(14, "AMOL");
		map.put(18, "1234");
		map.put(20, "amol");
		map.put(12, "Aasdfsdf");
		map.put(99, "ashkdjsk");
		
		
		System.out.println(map.get(15));
		System.out.println("--------------");
		
		
		for(Map.Entry<Integer, String> e : map.entrySet())
		{
			System.out.println(e.getKey() + " : " +e.getValue());
		}
		System.out.println("==============");
		
		map.remove(99);
		
		System.out.println(map.entrySet());
		
	}

}
