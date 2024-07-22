package Pack1;

public class arrayRevers{
	public static void main(String[] args) {
		
		int a[] = {23,34,55,66,76};
		int b[] = new int[a.length];
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ ",");
		}
		
		b[0]=a[4];
		b[1]=a[3];
		b[2]=a[2];
		b[3]=a[1];
		b[4]=a[0];
		
		a=b;
		System.out.println();
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ ",");
		}
	}

}
