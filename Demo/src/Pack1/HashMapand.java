package Pack1;

import java.util.HashMap;
import java.util.Map;

public class HashMapand {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		//addition
		map.put(101, "Java");
		map.put(102, "Version");
		map.put(108, "234");
		map.put(105, "anyValue");
		map.put(null, "safsff");
		map.put(null, null);
		map.put(123, null);
		map.put(134, null);
		
		
		// retrieval 
		for(Map.Entry<Integer,String> e : map.entrySet())
		{
			System.out.println(e.getKey() +" : " + e.getValue() );
		}
		
		System.out.println("--------------");
		// to remove 
		map.remove(102);
		for(Map.Entry<Integer,String> e : map.entrySet())
		{
			System.out.println(e.getKey() +" : " + e.getValue() );
		}
		
	}

}
