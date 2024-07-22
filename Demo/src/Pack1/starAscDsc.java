package Pack1;

public class starAscDsc {
	public static void main(String[] args) {
		for (int a=1; a<=7; a++)
		{
			for(int b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("====================");
		
		for (int x=6; x>=1; x--)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("====================");
		
		for (int c=1; c<=7; c++)
		{
			for (int d=7; d>c; d--)
			{
				System.out.print("- ");
			}
			for (int e=1; e<=c; e++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
