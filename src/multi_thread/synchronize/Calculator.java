package multi_thread.synchronize;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) { // synchronized 유무 비교 예제 
		synchronized (this) {	// synchronized block도 테스트 
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("interrupted");
			} catch (Exception e) {
				System.out.println("exception");
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}
