package multi_thread.state.interrupt;

public class PrintThread1 extends Thread {
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("running..");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}	
	}

}
