/*
class FinishDemo implements Runnable{
	long add = 0;
	String name;
	
	public FinishDemo(long a, String name) {
		this.name = name;
		add = a;
	}
	
	@Override
	public void run() {
		System.out.println(name + "자식 스레드 시작");
		long all = 0;
		
		for(int i=0; i<=add; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			all += i;
			System.out.println(name + ":" + all);
		}
		System.out.println(name + " "
				+ "자식 스레드 종료");
	}
}
/* 매번 끝나는 스레드가 달를 수 있다. 어떨땐 first 메인스레드는 예외없이 항상 먼저 끝남 *
// isAlive
public class ThreadTest4 {
	public static void main(String[] args) {
		// TODO 스레드의 종료 시점
		System.out.println("메인 스레드 시작");
		
		ThreadTest1 t1 = new ThreadTest1(10, "first");
		ThreadTest1 t2 = new ThreadTest1(10, "second");
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		
		tt1.start();
		tt2.start();
		
		// tt1,tt2가 끝날때까지 무한반복 for(; ;) 조건을 안 정해주면 무한반복이란 뜻
		// 메인은 자식스레드가 끝날 떄까지 일해야한다.
		// tt1, tt2 isAlive 일을 하고 있는중이냐
		// (tt1.isAlive() || tt2.isAlive())
		// 두 자식이 다 끝났다면 (!tt1.isAlive() && !tt2.isAlive())
		for(; ;) {
			if(!tt1.isAlive() && !tt2.isAlive()) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		
		System.out.println("메인 스레드 종료");
		}
	}
*/

// join 이용
class FinishDemo implements Runnable{
	long add = 0;
	String name;
	
	public FinishDemo(long a, String name) {
		this.name = name;
		add = a;
	}
	
	@Override
	public void run() {
		System.out.println(name + "자식 스레드 시작");
		long all = 0;
		
		for(int i=0; i<=add; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			all += i;
			System.out.println(name + ":" + all);
		}
		System.out.println(name + " "
				+ "자식 스레드 종료");
	}
}

public class ThreadTest4 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("메인 스레드 시작");
		
		ThreadTest1 t1 = new ThreadTest1(10, "first");
		ThreadTest1 t2 = new ThreadTest1(10, "second");
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		
		tt1.start();
		tt2.start();
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		// 메인은 첫번째보다는 항상 늦게 끝나는
		tt1.join();
		tt2.join();
		
		System.out.println("메인 스레드 종료");
		}
	}
