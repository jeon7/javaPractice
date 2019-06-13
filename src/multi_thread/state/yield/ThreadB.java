package multi_thread.state.yield;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) 
				System.out.println("Thread B working");
			else
				Thread.yield();
		}
		System.out.println("Thread B finished");
	}

}
