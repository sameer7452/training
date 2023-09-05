
public class Calculator {
	
	private double total;
	
	
	public void add(int num) {
		total+=num;
	}
	
	public void sub(int num) {
		total-=num;
	}
	
	public void multiply(int num) {
		total*=num;
	}
	
	public void divide(int num) {
		total/=num;
	}
	
	public void result() {
		System.out.println("total:"+total);
	}

}
