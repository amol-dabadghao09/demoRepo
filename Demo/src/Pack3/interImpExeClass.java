package Pack3;

public class interImpExeClass {
	
	public static void main(String[] args) {
		
		
		implemClass imp = new implemClass();
		imp.method_1();
	
		//static way to call static method
		implemClass.method_1();
		imp.method_2();
		
		System.out.println(test_1Inter.a);
		System.out.println(imp.a);
		System.out.println(implemClass.a);
		
		
		test_1Inter.method_1();
		
	}

}
