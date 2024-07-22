package Pack1;
import java.util.*;

public class PallindromeString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your string");
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String str = a;
		String b ="";
		
		for (int i=a.length()-1; i>=0; i--)
		{
			b = b+ a.charAt(i);
		}
		
		System.out.println("Reverse string == " +b);
		
		if(str.equalsIgnoreCase(b))
		{
			System.out.println(str+ " is pallindrome string");
		}
		else
		{
			System.out.println(str+ " is NOT pallindrome string");
		}
		
	}

}
