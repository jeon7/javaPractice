package multi_thread.beep;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("DDing");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				
			}
		}
	}

}
