package Pack1;

public class StringClass1 {
	
	public static void main(String[] args) {
		
		String x = "Hello Java programmer";
		String y = "Hello Java programMer";
		String z = new String("Hello Java programmer");
		
		System.out.println(x.equalsIgnoreCase(y));
		System.out.println(x.indexOf('J'));
		System.out.println(x.length());
		System.out.println(x.substring(6));
		
		System.out.println("----------------------------");
		
		String r[] = x.split(" ");
		for(int i=0; i<3; i++)
		{
			System.out.println(r[i]);
		}
	}

}
