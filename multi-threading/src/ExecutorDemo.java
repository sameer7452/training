import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GoRunnable implements Runnable{
	private final long countUntil;

	public GoRunnable(long countUntil) {
		this.countUntil = countUntil;
	}
	
	public void run() {
		long sum=0;
		for(long i=1;i<countUntil;i++)
			sum+=i;
		System.out.println(sum);
	}
	
}

public class ExecutorDemo {

	private static final int NTHREADS=10; //used when we are giving fixed number of threads
	
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(NTHREADS);
		//ExecutorService executor=Executors.newSingleThreadExecutor();
		//ExecutorService executor=Executors.newCachedThreadPool();
		
		long start=System.currentTimeMillis();
		for(int i=0;i<500;i++) {
			Runnable worker=new GoRunnable(10000000L+i);
			executor.execute(worker);  //uses factory method
		}  
		//this is will make the excutor accept no new threads
		//and finish all the existing threads int the queue
		executor.shutdown();
		//wait until all threads are finished
		//executor.awaitTermination();
		while(!executor.isTerminated()) {
			
		}
		System.out.println("finished all threads");
		long end=System.currentTimeMillis();
		System.out.println("time taken:"+(end-start)+"ms");
	}
	
}