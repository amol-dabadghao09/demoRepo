package Pack1;

public class ArrayMulti {
	
	public static void main(String[] args) {
		
	int nums[][] = new int [3][4];
	
	for (int i=0; i<nums.length; i++)
	{
		for(int j=0; j<nums[i].length; j++)
		{
			nums[i][j] = (int)(Math.random()*10);
		}
	}
	
	for (int n[] : nums)
	{
		for (int m : n)
		{
			System.out.print(m + " ");
		}
		System.out.println();
	}
	
	
//	for (int i=0; i<3; i++)
//	{
//		for (int j=0; j<4; j++)
//		{
//			System.out.print(nums[i][j] +" ");
//		}
//		System.out.println();
//	}
//	

	
	}
}
