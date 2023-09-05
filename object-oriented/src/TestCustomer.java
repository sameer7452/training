
public class TestCustomer {

	public static void main(String[] args) {
		Customer c1 = new Customer("sameer", 5000);
		c1.details();
		System.out.println(c1.getCreditLimit());
	}
}
