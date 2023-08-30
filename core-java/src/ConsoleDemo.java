import java.util.Scanner;

public class ConsoleDemo {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	
	String name = console.next();
	
	System.out.println("your name:"+name);
	
	int age = console.nextInt();
	System.out.println("your age:"+age);
}
}
