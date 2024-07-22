package Pack2;

public class getter {
	
	//encapsulation -- hiding data members from other class with private keyword
	private static int a=10;
	private int username;
	private int password;
	
	//setter
	public void SetData(int x, int y)
	{
		username = x+10+a;
		password = y+10+a;
	}
	
	public int getUsername()
	{
		return username;
	}
	
	public int getPassword()
	{
		return password;
	}
	
}
