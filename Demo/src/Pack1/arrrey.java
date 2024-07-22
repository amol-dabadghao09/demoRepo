package Pack1;

public class arrrey {
	public static void main(String[] args) {
		
		int a [] = {12,30,41,52,22};
		int size = a.length;
		
		System.out.println("size="+ size);
		System.out.println();
		
		for(int i=0; i<size; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println("reverse array ==>");
		
		for (int i=(a.length-1); i>=0; i--)
		{
			System.out.println(a[i]);
		}
	}

}
