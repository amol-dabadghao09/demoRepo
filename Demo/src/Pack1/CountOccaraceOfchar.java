package Pack1;
import java.util.*;

public class CountOccaraceOfchar {
	
	public static void main(String[] args) {
		
		String a = "AmolAmol";
		int total = a.length();
		
		a = a.toLowerCase();
		
		int A_count = a.replace("a", "").length();
		int M_count = a.replace("m", "").length();
		int O_count = a.replace("o", "").length();
		int L_count = a.replace("l", "").length();
		
		int Acount = total - A_count;
		int Mcount = total - M_count;
		int Ocount = total - O_count;
		int Lcount = total - L_count;
		
System.out.println("A = " +Acount + " M = " +Mcount + " O = " +Ocount + " L = " +Lcount);


	}

}
