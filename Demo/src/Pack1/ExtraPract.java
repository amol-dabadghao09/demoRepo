package Pack1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExtraPract {
		
	public static void main(String[] args) {
		
		String a = "amol";
		
		for(int i=0; i<a.length(); i++)
		{
			char b = a.charAt(i);
			
			if(b == 'a'|| b == 'e'|| b == 'i'|| b == 'o'|| b == 'u')
			{
				//System.out.println("Vowels in string == " +b);
			}
			
			if(b != 'a' && b != 'e' && b != 'i' && b != 'o' && b != 'u')
			{
				System.out.println("Non vowels in string == " +b);
			}
		
		}
		
	}
}
