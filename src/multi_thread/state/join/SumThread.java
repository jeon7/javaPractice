package multi_thread.state.join;

public class SumThread extends Thread {
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		System.out.println("sumThread run() started");
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
	
}
