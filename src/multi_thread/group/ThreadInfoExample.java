package multi_thread.group;

import java.util.Map;
import java.util.Set;

import multi_thread.daemon.AutoSaveThread;

public class ThreadInfoExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for (Thread thread : threads) {
			System.out.println("Name: " + thread.getName() +
						((thread.isDaemon())? " (Daemon)" : " (not Daemon)") +
						"\n\t소속그룹: " + thread.getThreadGroup().getName() + "\n\n");
			
			
		}
	}

}

//Name: Reference Handler (Daemon) 
//소속그룹: system
//
//
//Name: Finalizer (Daemon) => 가비지컬렉션을 담당하는 쓰레드 
//소속그룹: system
//
//
//Name: main (not Daemon)
//소속그룹: main
//
//
//Name: Common-Cleaner (Daemon)
//소속그룹: InnocuousThreadGroup
//
//
//Name: Signal Dispatcher (Daemon)
//소속그룹: system
//
//
//Name: AutoSaveThread (Daemon)
//소속그룹: main
//



