package examples;

public class Movie extends Entertainment {

	private int duration;
	private int price;

	public Movie(String title, String language, String genre, int duration, int price) {
		super(title, language, genre);
		this.duration = duration;
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Print() {
		super.Print();
		System.out.println("\tDuration:" + duration+" minutes");
	}

	@Override
	public void buy() {
		System.out.println("The price of this movie ticket is:" + price+"\n");
	}

}
