
public class TestLink {

	public static void main(String[] args) {
		
		LinkedList lst= new LinkedList();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		
		lst.print();
		
		lst.remove(20);
		lst.print();
		
//		lst.addAfter(20, 25);
//		lst.addAfter(30, 35);
//		lst.print();
//		
//		lst.addBefore(20, 15);
//		lst.addBefore(10, 5);
//		lst.print();
	}
}
