package multi_thread.state.stop;

public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while (!stop) {
			System.out.println("running.");
			
		}
		System.out.println("자원정리");
		System.out.println("run() ends");
	}

}
