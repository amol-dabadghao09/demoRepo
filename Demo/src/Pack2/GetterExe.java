package Pack2;

public class GetterExe {
	
	public static void main(String[] args) {
		
		getter g = new getter();
		g.SetData(25, 35);
		
	//	System.out.println("New username = " + g.getUsername());
	//	System.out.println("New password = " + g.getPassword());
		
		int newUser = g.getUsername();
		int newPass = g.getPassword();
		
		System.out.println("New username = " +newUser);
		System.out.println("New passwrod = " +newPass);
		
	}

}
