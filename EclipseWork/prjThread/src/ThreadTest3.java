/*
class StopDemo implements Runnable{
	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("Thread is alive ....");
			Thread.sleep(500);
			}
		}
		catch(InterruptedException err){
			err.printStackTrace();
		}
		// 5초 동안 살아있다가 마지막에 finally 가 출력되는
		finally {
			System.out.println("Thread is dead ....");
		}
	}
}

public class ThreadTest3 {
	// 오버라이드 아니니까 throws 로 예외처리 가능하다.
	public static void main(String[] args) throws InterruptedException{
		// TODO 스레드의 강제 종료
		StopDemo demo = new StopDemo();
		Thread t = new Thread(demo);
		t.start();
		
		Thread.sleep(5000);
		
		t.stop();
	}
}
*/

/* interrupt 쓰는 방법
class StopDemo implements Runnable{
	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("Thread is alive ....");
			Thread.sleep(500);
			}
		}
		catch(InterruptedException err){
			err.printStackTrace();
		}
		finally {
			System.out.println("Thread is dead ....");
		}
	}
}

public class ThreadTest3 {
	// 오버라이드 아니니까 throws 로 예외처리 가능하다.
	public static void main(String[] args) throws InterruptedException{
		StopDemo demo = new StopDemo();
		Thread t = new Thread(demo);
		t.start();
		
		Thread.sleep(5000);
		// stop을 interrupt로만 바꿔주면 된다. 좀 더 자연스럽게
		t.interrupt();
	}
}
*/

// 내가 직접 처리하는 방법 (다양한 형태가능)
class StopDemo implements Runnable{
	// flag 변수 
	private boolean stopped = false;
	
	// 내가 원하는 시점에 스레드를 조정할 수 있게
	void off() {
		stopped = true;
	}
	
	// true라고 쓴게 !stopped란 같다 stopped면 반복을 안 돈다.
	@Override
	public void run() {
		try {
		while(!stopped) {
			System.out.println("Thread is alive ....");
			Thread.sleep(500);
			}
		}
		catch(InterruptedException err){
			err.printStackTrace();
		}
		
		finally {
			System.out.println("Thread is dead ....");
		}
	}
}

public class ThreadTest3 {
	public static void main(String[] args) throws InterruptedException{
		StopDemo demo = new StopDemo();
		Thread t = new Thread(demo);
		t.start();
		
		Thread.sleep(5000);
		// 내가만든 함수 off 그리고 Stopdemo 객체 이름 적어주기
		demo.off();
	}
}