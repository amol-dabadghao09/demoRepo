package Pack1;
import java.util.*;

public class DuplicateCharinString {
	
	public static void main(String[] args) {
		
		String a = "AMolAMOL";
		char b[] = a.toCharArray();
		
		
		for(int i=0; i<a.length(); i++)
		{
			for(int j=i+1; j<a.length(); j++)
			{
				if(b[i] == b[j])
				{
					System.out.println("Duplicate character in your String == " +b[j]);
				}
			}
		}
	}

}
