package Pack1;
import java.util.*;

public class PallindromNum {
	public static void main(String[] args) {
		
		System.out.println("Enter your number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		int temp=n;
		int rem;
		
		while(n>0)
		{
			rem = n%10;
			sum = (sum*10)+rem;
			n = n/10;
		}
		if(temp == sum)
		{
			System.out.println(temp + " is Pallindrome NUM");
		}
		else
		{
			System.out.println(temp+ " is NOT pallindrome");
		}

}
}