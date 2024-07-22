package Pack1;
import java.util.*;

public class AnagramString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter any 2 string to check ");
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		String a = s1.next();
		String b = s2.next();
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		char c[] = a.toCharArray();
		char d[] = b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		boolean R = Arrays.equals(c, d);
		
		if(R == true)
		{
			System.out.println("Anagram String");
		}
		else
		{
			System.out.println("NOT anagram String");
		}
		
	}
}
