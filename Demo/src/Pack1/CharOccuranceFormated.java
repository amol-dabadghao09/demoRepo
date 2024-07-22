package Pack1;

import java.util.HashMap;
import java.util.Map;

public class CharOccuranceFormated {
	public static void main(String[] args) {
		
		String a = "CharCharChar";
		char b[] = a.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
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
		
		System.out.println(map);
		System.out.println("--------------");
		
		for(Map.Entry<Character, Integer> e : map.entrySet())
		{
			System.out.print(e.getKey());
			System.out.print(e.getValue());
		}
	}

}
