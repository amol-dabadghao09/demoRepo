package Pack1;

import java.util.HashMap;
import java.util.Map;

public class CharOcarancebyMap {
	
	public static void getCharCount(String name)
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char b[] = name.toCharArray();
		
		for(char c : b)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(name+ " : " +map);		
		
	}
	
	public static void main(String[] args) {
		
		getCharCount("test");
	}
}
