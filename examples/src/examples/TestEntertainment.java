package examples;

public class TestEntertainment {

	public static void main(String[] args) {
		
		Movie m1=new Movie("Avengers","English","Action",130,300);
		m1.Print();
		m1.buy();
		
		Series s1=new Series("Peaky Blinders","English","Drama",200,"Netflix",6);
		s1.Print();
		s1.buy();
		
	
		
		}
}
