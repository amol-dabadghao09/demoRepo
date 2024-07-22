package Pack2;

public class encapBeta {
	
	private static int a=10;
	private int b=20;
	private int c=30;
	
	encapBeta()
	{
		a=40;
		b=50;
		c=60;
	}
	
	encapBeta(int z)
	{
		b=800;
		c=5;
	}
	
	public int add()
	{
		int x=a+b+c;
		return x;
	}

}
