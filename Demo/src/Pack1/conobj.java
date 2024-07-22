package Pack1;

public class conobj {
	static int a=10;
		   int b=20;
		   int c=30;
		   
		   conobj()
		   {
			   a=35;
			   b=45;
			   c=55;
		   }
		   
		   conobj(int s)
		   {
			   a=85;
			   b=455;
		   }
		   
		   conobj(char s)
		   {
			   c=666;
		   }
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println("-----------------");
		
		conobj x=new conobj();
		
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(a);
		System.out.println("-----------------");
		
		conobj y=new conobj(33);
		
		System.out.println(y.b);
		System.out.println(y.c);
		System.out.println(a);
		System.out.println("-----------------");
		
		conobj z=new conobj('#');
		
		System.out.println(z.b);
		System.out.println(z.c);
		System.out.println(a);
		
	}
}
