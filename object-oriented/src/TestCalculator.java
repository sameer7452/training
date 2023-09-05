
public class TestCalculator {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.result();

		c1.add(100);
		c1.result();

		c1.sub(20);
		c1.result();

		c1.multiply(2);
		c1.result();

		c1.divide(40);
		c1.result();
	}
}
