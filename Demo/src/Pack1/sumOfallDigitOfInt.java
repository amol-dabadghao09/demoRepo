package Pack1;

public class sumOfallDigitOfInt {
	public static void main(String[] args) {
		
		int n = 54321;
        String a = Integer.toString(n);
        char b[] = a.toCharArray();
        int sum=0;
        
        for(int i=0; i<b.length; i++)
        {
            sum = sum + Character.getNumericValue(b[i]);
            
        }
        
        System.out.println("Sum of all digit = " +sum);
        
	}

}
