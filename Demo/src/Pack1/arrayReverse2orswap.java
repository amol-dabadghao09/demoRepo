package Pack1;

public class arrayReverse2orswap {
	public static void main(String[] args) {
		
		int a[]= {43,56,33,66,99};
		
		for (int i=0;i<a.length; i++)
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
	}

}
