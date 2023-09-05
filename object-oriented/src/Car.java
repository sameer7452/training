import java.util.Iterator;

public class Car {
	private String model;
	private String[] faetures;
	
	public Car(String model, String...faetures) {  //var-args
		this.model = model;
		this.faetures = faetures;
	}
	
	public void specs() {
		System.out.println("features of"+model);
		for(String f: faetures)
			System.out.println(">"+f);
	}
	
	public static void main(String[] args) {
		
		
		Car alto = new Car("\tSuzuki Alto","keyless","ac");
		alto.specs();
		
		Car astor = new Car("\tMG astor","abs","keyless","auto");
		astor.specs();
	}
	
	
}
