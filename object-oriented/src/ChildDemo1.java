
public class ChildDemo1<S, P> extends Demo<S> {

	private P dummy;
	public ChildDemo1(S data,P dummy) {
		super(data);
		this.dummy=dummy;
	}
	
	public P getDummy(){
		return dummy;
	}

	public void setDummy(P dummy) {
		this.dummy = dummy;
	}
	
	public static void main(String[] args) {
		ChildDemo1<String,Integer> cd1 = new ChildDemo1<String,Integer>("jack",33);
		System.out.println(cd1.getData()+"\t"+cd1.getDummy());
	}
}
