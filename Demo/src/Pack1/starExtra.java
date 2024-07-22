package Pack1;

public class starExtra {
	public static void main(String[] args) {
		
		int noofline=10;
		for (int line=1; line<=noofline; line++)
		{
			for (int space=(noofline-1); space>=line; space--)
			{
				System.out.print("- ");
			}
			for (int star=1; star<=line; star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}