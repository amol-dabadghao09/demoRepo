package Pack1;

public class extraArrPrac {
	
	public static void main(String[] args) {
		
		int a[]= {22,44,66,77,88};
		// int b[]= new int[a.length];
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ ",");
		}
		
		for (int i=0; i<a.length/2; i++)
		{
			int z=a[i];
			a[i]=a[(a.length-1)-i];
			a[(a.length-1)-i]=z;
		}
		

		System.out.println();
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ ",");
		}
		System.out.println();
		System.out.println("array length="+ a.length);

	}

}
