package Pack2;

public class upcastexe {
	
	public static void main(String[] args) {
		
		upcast a = new upcast();
		a.test();
		
		upcastsub b = new upcastsub();
		b.test();
		
		// upcasting
		
		upcast s = new upcastsub();
		s.test();
		
	}

}
