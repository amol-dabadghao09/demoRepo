package Pack2;

public interface interTest1 {
	
	static void demo()
	{
		System.out.println("Static method of interface");
	}
	
	default void alpha()
	{
		System.out.println("alpha method of interface");
	}
	
	void test1();
	

}
