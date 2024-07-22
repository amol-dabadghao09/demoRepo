package Pack1;

public class staticblock {
	static String a="static_block and veriable";
	int x=22;
	
	static 
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		System.out.println("*********************");
		
		staticblock x= new staticblock();
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
		staticblock y= new staticblock();
		staticblock z= new staticblock();
		
		System.out.println("------------------");
				
	}
		
		{
		System.out.println(x);
		System.out.println("non-static block");
		}
		

}
