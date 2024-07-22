package Pack1;

public class FibbonacciSeries {
	
	static void Fibbo(int n)
	{
		int num1=0,num2=1,count=0;
		
		while(count<n)
		{
			System.out.println(num1);
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			count++;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Fibbo(10);
		
	}

}
