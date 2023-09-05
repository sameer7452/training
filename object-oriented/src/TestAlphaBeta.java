
public class TestAlphaBeta {

	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.demo();
		
		//Beta bt =(Beta) a   (error(because a has only alpha class))
		
		Beta b =new Beta();
		b.test();
		b.demo();
		
		Alpha ab =b; //upcasting(implicit)
		ab.demo();
		//ab.test();
		
		Beta ba = (Beta) ab;//downcasting (explicit)
	}
}
