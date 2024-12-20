package MultiThreading;

public class TestThreads {

	public static void main(String[] args) throws InterruptedException {
		 Thread thread = new Thread(new Runnable() {
			 @Override
			 public void run() {
				 System.out.println("We are in thread : "+ Thread.currentThread().getName());
				 
			 }
		 } );
		 System.out.println("In Thread : "+ Thread.currentThread().getName()+" Before start.");
		 
		 thread.start();
		 
		 System.out.println("In Thread : "+ Thread.currentThread().getName()+" After start.");
		 
		 Thread.sleep(1000);

	}

}
