package Pack1;
import java.util.*;

public class PrintNumWithoutLoop {
	
	public static void number(int num)
	{
		if(num<=20)
		{
			System.out.println(num);
			number(num+1);
		}
	}
	
	public static void main (String[] agrs) {
		
		int a=1;
		number(a);
		
		
	}
	
}
