package multi_thread.state.wait_notify2;

public class DataBox {
	private String data;
	
	// consummer를 위한 동기화 메소드 
	public synchronized String getData() {
		// 일단 데이터값이 없으면 데이터를 읽지않는다. 
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 데이터를 읽을 준비가 되어있음. 
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		
		data = null;
		notify(); // producer 쓰레드를 깨운다. wait을 호출하지 않으면 나도 깨어있음. 
		
		return returnValue;
	}

	// producer를 위한 동기화 쓰레드 
	public synchronized void setData(String data) {
		// 일단 데이터값이 있으면 새 데이터를 쓰지 않는다. 읽혀지지 않았다는 의미니깐.
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 데이터를 쓸 준비가 되어있음. 
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " +data);
		notify(); // 데이터를 썼으니 데이터를 읽는 메소드를 실행하고있는 쓰레드를 깨워준다. 
	}
}
