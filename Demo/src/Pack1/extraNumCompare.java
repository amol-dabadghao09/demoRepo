package Pack1;

public class extraNumCompare {
	public static void main(String[] args) {
		
		int a=50;
		int b=500;
		int c=50;
		int d=500;
		
		if(a>b && a>c && a>d)
		{
			System.out.println("a is Big");
		}
		else if(b>a && b>c && b>d)
		{
			System.out.println("b is Big");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println("c is Big");
		}
		else if(d>a && d>b && d>c)
		{
			System.out.println("d is Big");
		}
		else if (a==b && a==c && a==d)
		{
			System.out.println("All num are same");
		}
		else if (a==b || a==c || a==d)
		{
			System.out.println("Any 2 numbers are same, Enter valid numbers");
		}
	}

}
