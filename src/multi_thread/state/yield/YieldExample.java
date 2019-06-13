package multi_thread.state.yield;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		System.out.println("A started");
		threadB.start();
		System.out.println("B started");
		
		sleep(2);
		threadA.work = false;
		System.out.println("A yielded");
		
		sleep(2);
		threadA.work = true;
		System.out.println("A started working again");
		
		sleep(5);
		threadA.stop = true;
		System.out.println("A stopped");
		threadB.stop = true;
		System.out.println("B stopped");
		
	}

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}