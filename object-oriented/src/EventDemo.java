
class OuterEventImpl implements Event{
	@Override
	public void doSomething() {

		System.out.println("outer event");
	}
}

public class EventDemo implements Event {

	@Override
	public void doSomething() {
       System.out.println("simple event implementation");
	}
	
	private class InnerEventImpl implements Event{
		@Override
		public void doSomething() {

			System.out.println("Inner event");
		}
	}
	public static class StaticEventImpl implements Event{
		@Override
		public void doSomething() {

			System.out.println("Static event");
		}
	}
	
	public void oneMoreEvent() {
		class NestedEventImpl implements Event{
			@Override
			public void doSomething() {

				System.out.println("nested event");
			}
		};
		new NestedEventImpl().doSomething();
	}
	
	public void oneLastEvent() {
		Event e=new Event(){
			
			@Override
			public void doSomething() {

				System.out.println("anonymus event");
				
			}
		};
		e.doSomething();
	}
	
	public void pakkaLastEvent() {
		Event e =() -> System.out.println("lambda event");
		e.doSomething();
	}
	public static void main(String[] args) {
		EventDemo ed= new EventDemo();
		ed.doSomething();
		
		OuterEventImpl oe= new OuterEventImpl();
		oe.doSomething();
		
		InnerEventImpl ie= ed.new InnerEventImpl();
		ie.doSomething();
		
		EventDemo.StaticEventImpl se= new EventDemo.StaticEventImpl();
		se.doSomething();
		
		ed.oneMoreEvent();
		ed.oneLastEvent();
		ed.pakkaLastEvent();
	}
	

}
