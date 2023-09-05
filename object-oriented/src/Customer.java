
public class Customer {

	private String custName;
	private int custId;
	private double creditLimit;

	private static int counter=1;
	
	public Customer() {
	}

	public Customer(String custName, double creditLimit) {
		super();
		this.custName = custName;
		this.custId = counter++;
		this.creditLimit = creditLimit;
	}

	public void details() {
		System.out.println("customer name:" + custName);
		System.out.println("customer id:" + custId);
		System.out.println("credit limit:" + creditLimit);
	}

	public double getCreditLimit() {
		return creditLimit;
	}

}
