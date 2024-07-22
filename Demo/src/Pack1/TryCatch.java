package Pack1;

public class TryCatch {
	public static void main(String[] args) {
		
		int a=12;
		int b=0;
		int c=0;
		int x[] = {12,34,56,78};
		
		try 
		{
			System.out.println("Try block");
			c=a/b;
			System.out.println(x[15]);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
			System.out.println("Ans: ♾️");
		
				try 
				{
					System.out.println(x[6]);
				}
				catch(ArrayIndexOutOfBoundsException B)
				{
					System.out.println("check ARRAY index");
				}
		}
		catch(ArrayIndexOutOfBoundsException A)
		{
			System.out.println("Ans : check array index");
		}
		
		// common Handling for all exception .. As Exception is super class of Runtime and Other Exception
//		catch(Exception e) {
//			
//			System.out.println("exception catch ");
//		}
		
		System.out.println(c);
		System.out.println(++c);
		System.out.println("End");
		
	}
	
}
