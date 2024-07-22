package Pack1;
import java.util.*;

public class OddEvenExtra {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Your number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		for(int i=0; i<=a; i++)
		{
		
		if(i%2 == 0)
		{
			System.out.println(i+ " even number");
		}
		else
		{
			System.out.println(i+ " ODD number");
		}
		
		}
	}

}
