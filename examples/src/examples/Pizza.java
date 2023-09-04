package examples;

public class Pizza {

	private String name;
	private String category;
	private String size;
	private double price;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public Pizza(String name, String category, String size, double price) {
		this.name = name;
		this.category = category;
		this.size = size;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", category=" + category + ", size=" + size + ", price=" + price + "]";
	}
	
	
	
}
