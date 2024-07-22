package Pack2;


public class Execution {
	
	public static void main(String[] args) 
	{
			
			Delhi.test();
			System.out.println("Static veriable a= " + Delhi.a);
			
			Delhi d = new Delhi();
			
			d.demo();
			System.out.println("Non-static veriable b= " +d.b);
			
			Hyd.test();
			System.out.println(Hyd.a);
			
			Hyd h = new Hyd();
			h.demo();
			h.alpha();
			System.out.println(h.b);
			System.out.println("hyd class non-static veriable x= " + h.x);
			
		
	}
}
