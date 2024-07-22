package Pack1;

public class SwitchState {
	public static void main(String[] args) {
		
		String day = "Monday";
		String result = "";
		
//		switch(day)
//		{
//		case "Saturday", "Sunday" -> result = "6am";
//		case "Monday" -> result = "8am";
//		default -> result = "7am";
//		}
//		System.out.println(result);

    //	2nd method -- return a value
		
		result = switch (day)
				{
				case "Saturday", "Sunday" -> "6am";
				case "Monday" -> "8am";
				default -> "7am";
				};
				
		System.out.println(result);

	}

}
