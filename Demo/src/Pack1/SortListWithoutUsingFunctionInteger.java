package Pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortListWithoutUsingFunctionInteger {
	
	static void sort(ArrayList<Integer> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i) > list.get(j))
				{
					int z = list.get(i);
					list.set(i, list.get(j));
					list.set(j, z);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,6,0));
		
		Collections.addAll(list, 8,6,2);
		
		sort(list);
		System.out.println(list);
		
	}

}
