package Pack1;

public class returntype {
	

	int add (int x, int y)
	{
		int z = x+y;
		System.out.println("z= " +z);
		return z;
	}
	
	public static void main(String[] args) {
		
		returntype t = new returntype();
		
		int result = t.add(20,30);
		System.out.println("result = "+result);
		
		result = t.add(result, 40);
		result = t.add(result, 50);
		result = t.add(result, 60);
		System.out.println("result = "+result);
		
	}
}
