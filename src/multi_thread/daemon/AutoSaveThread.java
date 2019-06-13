package multi_thread.daemon;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("task saved. ");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}

}
