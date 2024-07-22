package Pack1;
import java.util.*;

public class LcmHcf {
		
	public static void main(String[] args) {
		
		System.out.println("Enter 2 number to see LCM and HCF");
		
		Scanner s1 = new Scanner (System.in);
		Scanner s2 = new Scanner (System.in);
		
		int num1 = s1.nextInt();
		int num2 = s2.nextInt();
		int hcf=1,lcm=1;
		
		for(int i=1; i<=num1; i++)
		{
			if(num1%i ==0 && num2%i ==0)
			{
				hcf=i;
			}
		}
		System.out.println("HCF == " +hcf);
		
		lcm = (num1*num2)/hcf;
		System.out.println("LCM == " +lcm);
	}

}
