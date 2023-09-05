

public class DoubleLink {

	private class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}
		

	}

	private Node first;
	private Node current;
	private Node next;

	public void add(int d) {
		Node n = new Node(d);

		if (first == null)
			first = n;
		if (current != null)
			current.setNext(n);
		n.setPrev(current);
		current = n;
		
	}

	public void printForward() {
		Node t = first;
		while (t != null){
			System.out.println(t.getData());
			t = t.getNext();
		}
	}
	
	public void printBackward() {
		Node t = current;
		while (t != null){
			System.out.println(t.getData());
			t = t.getPrev();
		}
	}
	
	public void remove(int d) {
		Node t=first;
		Node p=null;
		while(t != null) {
			if(t.getData()==d) {
				if(t==first) 
					first=t.getNext();
				else
					p.setNext(t.getNext());
				
				t.next=null;
				break;
				}
				p=t;
				t=t.getNext();
			}
		}
}
