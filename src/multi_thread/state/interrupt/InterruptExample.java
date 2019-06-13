package multi_thread.state.interrupt;

public class InterruptExample {

	public static void main(String[] args) {
		Thread printThread2 = new PrintThread2();
		printThread2.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		printThread2.interrupt();
		
	}

}
