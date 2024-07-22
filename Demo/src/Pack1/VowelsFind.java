package Pack1;

public class VowelsFind {
	public static void main(String[] args) {
		
		String a = "Amol";
		a = a.toLowerCase();
		
		for(int i=0; i<a.length(); i++)
		{
			
			char b = a.charAt(i);
			
			if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u')
			{
				System.out.print(b);
				
			}
			
		}
		
	}
}
