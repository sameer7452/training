
public class SynchDemo implements Runnable {

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		print(name);

	}
	
	private Object dummy=new Object();
	
	private void print(String name) {
		
		System.out.println("thread entered:"+name);
		try {
			synchronized (dummy) { //this object thread is synchronized because this is the only part that is manipulating the data
			System.out.print("[");
			Thread.sleep(1000);
			System.out.print(name);
			Thread.sleep(1000);
			System.out.println("]");
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("thread exited:"+name);
	}
	
	public static void main(String[] args) {
		SynchDemo sd=new SynchDemo();
		
		Thread t1=new Thread(sd,"Alfa");
		Thread t2=new Thread(sd,"beta");
		Thread t3=new Thread(sd,"gama");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
