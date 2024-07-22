package Pack1;

import java.util.ArrayList;

public class stringToArrayListAndSortTheString {
	
	public static void main(String[] args) {
		
		String a = "amol";
		char b[] = a.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		
		for(int i=0; i<b.length; i++)
		{
			list.add(b[i]);
		}
		
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i) > list.get(j))
				{
					char temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		System.out.println(list);
		
		for(char c : list)
		{
			System.out.print(c);
		}
	}
}
