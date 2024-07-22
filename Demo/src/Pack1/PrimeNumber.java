package Pack1;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int n;
		int temp=0;
		
		System.out.println("Eneter any number");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			if(n%i == 0)
			{
				temp++;
			}
		}
		if (temp == 2)
		{
			System.out.println(n +" is Prime number");
		}
		else
		{
			System.out.println(n + " is Not a prime number");
		}
		
	}

}
