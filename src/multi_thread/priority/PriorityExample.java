package multi_thread.priority;

public class PriorityExample {

	public static void main(String[] args) {
		
		Thread[] thread = new CalcThread[11];
		
		for(int i = 1; i <= 10; i++) {
			
			thread[i] = new CalcThread("thread" +i);
					
			if(i == 10) {
				thread[i].setPriority(Thread.MAX_PRIORITY);
			} else {
				thread[i].setPriority(Thread.MIN_PRIORITY);
			}
		}
		
		for(int i = 1; i <= 10; i++) {
			thread[i].start();
		}
	}

}
