package Pack1;

public class LowerToUpperAndViceVersa {	
		
	public static void main(String[] args) {
		
		String a = "mY InDiA";
		StringBuffer b = new StringBuffer(a);
		
		for(int i=0; i<a.length(); i++)
		{
			if(Character.isLowerCase(a.charAt(i)))
			{
				b.setCharAt(i, Character.toUpperCase(a.charAt(i)));
			}
			else
			{
				b.setCharAt(i, Character.toLowerCase(a.charAt(i)));
			}
		}
		
		System.out.println(b);
		
	}

}
