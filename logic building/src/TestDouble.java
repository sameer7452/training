
public class TestDouble {

	public static void main(String[] args) {
		
		DoubleLink dl=new DoubleLink();
		dl.add(120);
		dl.add(45);
		dl.add(36);
		
		dl.printForward();
		System.out.println();
		dl.printBackward();
	}
}
