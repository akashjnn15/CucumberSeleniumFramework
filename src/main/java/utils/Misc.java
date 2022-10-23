package utils;

public class Misc {
	
	
	
	public static void main(String[] args) {
		String str="^User is on Login Page";
		
		str=str.replace("^", "").toUpperCase().replace("$", "");
		
		System.out.println(str);
		
	}

}
