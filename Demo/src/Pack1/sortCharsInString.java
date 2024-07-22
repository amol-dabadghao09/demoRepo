package Pack1;

public class sortCharsInString {
	
	public static void main(String[] args) {
		
		String a = "yyzxadcbb";
		char b[] = a.toCharArray();
		char temp=0;
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=i+1; j<b.length; j++)
			{
				if(b[i] > b[j])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		
		System.out.println(b);
		
	}

}
