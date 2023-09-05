
public class HelloDemo {

	public static void main(String[] args) {
		Hello h1=()->"Hello world";
		System.out.println(h1.sayHello());
		
		Hello h2=()->{
			String msg="Bonjour le monde";
			return msg;
		};
		System.out.println(h2.sayHello());
		System.out.println(h2.sayBye());
	
		Hello.greeting();
	}
}
