
public class EmailValidator {
	public static void main(String[] args) {
		//1-min 4 chars before @
		//2-min 3 chars between @ and .
		//3- min 2 chars after .
		//4-only 1 occurance of @ and . is allowed
		//Note: No regular expresessions allowed
		//sysout(i<4||j-i<4||mail.length()-j<3||i!=i1||j!=j1?"valid:"invalid");
		String mail = "zubair@gmail.com";
		int i=mail.indexOf("@");
		int i1=mail.lastIndexOf("@"); // i=mail.lastindexof("@")
		int j=mail.indexOf(".");
		int j1=mail.lastIndexOf(".");
		
		if(i<4||j-i<4||mail.length()-j<3||i!=i1||j!=j1) {
			System.out.println("invalid");
		}
		else
		{
			System.out.println("valid");
		}
		
	}

}
