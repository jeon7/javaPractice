package multi_thread.state.interrupt;

// sleep 메소드를 쓰지 않은 예제. 
public class PrintThread2 extends Thread {
	
	@Override
	public void run() {
		while (true) {
			System.out.println("running..");
			if(isInterrupted()) {
				System.out.println("Thread.isInterrupted()");
				break;
			}
		}
	}
	
	

}
