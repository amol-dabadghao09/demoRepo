package Pack1;

public class NonDuplicateChar {
	public static void main(String[] args) {
		
		String a = "aabbccdef";
		char b[] = a.toCharArray();
		
		for(int i=0; i<a.length(); i++)
		{
			if(a.lastIndexOf(b[i]) == a.indexOf(b[i]))
			{
				System.out.println("1st NON Duplicate character in String = " +b[i]);
				break;
			}
			
		}
		
	}
}
