

public class CircularLink {

	private class Node {
		private int data;
		private Node next;

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
		current = n;
		n.setNext(first);
	}

	public void print() {
		Node t = first;
		 do{
			System.out.println(t.getData());
			t = t.getNext();
		}while (t != first);
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
