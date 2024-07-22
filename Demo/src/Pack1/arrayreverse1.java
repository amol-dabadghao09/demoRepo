package Pack1;

public class arrayreverse1 {
	public static void main(String[] args) {
		
		int a[]= {23,34,43,21,12};
		int b[]= new int[a.length];
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ ",");
		}
		
		for (int i=0; i<a.length; i++)
		{
			b[i]=a[(a.length-1)-i];
		}
		a=b;
		
		System.out.println();
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ ",");
		}
	}

}
