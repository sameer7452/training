
public class RegExDemo {
public static void main(String[] args) {
	
	String name = "Sameer";
	String mobile = "8876543210";
	String mail = "sameer@gmail.com";
	
	String nameRegex = "[A-Z]{1}[a-z]{3,}";
	String mobileRegex ="[6-9]{1}[0-9]{9}";
	String emailRegex ="/.*@[a-z0-9.-]*/";
	
	System.out.println(name.matches(nameRegex)?"valid name":"invalid name");
	System.out.println(mobile.matches(mobileRegex)?"valid mobile":"invalid mobile");
	System.out.println(mail.matches(emailRegex)?"valid email":"invalid email");
}
}
