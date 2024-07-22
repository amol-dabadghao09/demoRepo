package Pack3;

public class Bclass extends Aclass {
	
	static int c =30;
	int d = 40;
	
	static void bclassMethodStatic()
	{
		System.out.println("This is Static method of Bclass");
		Bclass bObj = new Bclass();
		bObj.d = 80;
		System.out.println(bObj.d);
		
	}
	
	void bclassMethodNonStatic()
	{
		System.out.println("This is Non-static method of Aclass");
		int e = c+d;
		System.out.println(e);
		int f = Bclass.a + d;
		System.out.println(f);
		System.out.println("b = " +b);
	}
	
}
