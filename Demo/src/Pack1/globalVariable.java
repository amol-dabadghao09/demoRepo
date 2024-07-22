package Pack1;

public class globalVariable {
	
	static int a=22;	// global + class variable
	static int b=45;	// global + instance variable
	int c =80;
		   
	globalVariable()
	{
		a=55;
		b=67;
		System.out.println("This is Demo method");
		System.out.println("Local veriable a = "+a);
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		new globalVariable();
		
		System.out.println("----------------------");
	
		globalVariable x = new globalVariable();
		System.out.println("This is non static veriable c = "+x.c);
	
	}

}
