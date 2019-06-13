package multi_thread.state.yield;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) 
				System.out.println("Thread A working");
			else
				Thread.yield();
		}
		System.out.println("Thread A finished");
	}
	
}