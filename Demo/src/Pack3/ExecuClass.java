package Pack3;

public class ExecuClass {
	
	static Bclass bca;
	
	
	public static void main(String[] args) {
		
		
		System.out.println(bca.a);
		System.out.println(Aclass.a);
		
		
		Aclass.aclassMethodstatic();
		
		System.out.println(Aclass.a);
		
		
		Bclass.aclassMethodstatic();
		Bclass.bclassMethodStatic();
		
		
		Bclass.a = 50;
		
		System.out.println(Aclass.a);
		Bclass b = new Bclass();
		b.aclassMethodNonStatic();
		b.bclassMethodNonStatic();
		
	}
	

}


