package Pack1;

public class ReverseStringSameplace{
	
	public static void main(String[] args) {
		
		String s ="Java version";
		String a[] = s.split(" ");
		String b="";
		
		for(int i=0; i<a.length; i++)
		{
			String c = a[i];
			String d = "";
			
			for(int j=c.length()-1; j>=0; j--)
			{
				b = b+c.charAt(j);
			}
			b = b+d+" ";
		}
		System.out.println(b);
		
	}

}
