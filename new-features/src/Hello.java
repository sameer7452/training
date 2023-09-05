@FunctionalInterface
public interface Hello {

	String sayHello();
	
	default String sayBye() {
		return "good bye";
	}
	
	static void greeting() {
		System.out.println("good day");
	}
}
