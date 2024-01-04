/*
public class ThreadTest2 implements Runnable{
	long add = 0;
	String name;
	
	ThreadTest2(long a, String n){
		add = a;
		name = n;
	}
	@Override
	public void run() {
		long all = 0;	
		
		// Runnable인터페이스엔 run 메서드만 있어서 sleep을 못 쓴다.
		// sleep()은 static 이여서 thread.sleep으로
		
		for(int i=0; i<=add; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			all += i;
			System.out.println(name + ":" + all);
		}
	}
	
	public static void main(String[] args) {
		// TODO Runnable인터페이스를 상속받아 스레드를 만드는 방법 
		ThreadTest2 t1 = new ThreadTest2(5, "첫번째 스레드");	// Thread가 아니다. 인스턴스일뿐
		ThreadTest2 t2 = new ThreadTest2(5, "두번째 스레드");
		
		// 이렇게 해야 Thread가 3개가 되는것이다
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		
		tt1.start();
		tt2.start();
		}
	}
*/

/*
// 다른기능으로 다른 작업을 할 수 있는것을 runnable 버전으로
public class ThreadTest2 implements Runnable{
	long add = 0;
	String name;
	
	// 인터페이스는 객체를 호출할 수 없어서 super(name) 을 쓸 수가 없다.
	// getName 메서드도 쓸 수가 없다. 그래서 name 변수 만들어 주기. 꼼수
	ThreadTest2(long a, String name){
//		super(name);
		add = a;
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + "자식 스레드 시작");
		long all = 0;
		
		for(int i=0; i<=add; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			all += i;
			System.out.println(name + ":" + all);
		}
		System.out.println(name + " "
				+ "자식 스레드 종료");
	}
	
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		ThreadTest2 t1 = new ThreadTest2(10, "first");
		ThreadTest2 t2 = new ThreadTest2(10, "second");
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t1);
		
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
		
		System.out.println("메인 스레드 종료");
		}
	}
*/


class ThreadDemo implements Runnable{
	String name;
	Thread t;
	
	public ThreadDemo(String name) {
		// d1이라는 주소도 this로 전달되어넘어온다.
		this.name = name;
		
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name + ":" + i);
		}
	}
}

// 메인코드 더 이상 수정금지
public class ThreadTest2{
	public static void main(String[] args) {
		ThreadDemo d1 = new ThreadDemo("스레드1");
		ThreadDemo d2 = new ThreadDemo("스레드2");
		ThreadDemo d3 = new ThreadDemo("스레드3");
	}
}