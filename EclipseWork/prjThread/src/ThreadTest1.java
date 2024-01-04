/* 단일스레드
public class ThreadTest1 {
	long add = 0;
	
	ThreadTest1(long a){
		add = a;
	}
	
	// main 메서드 한개밖에 없으니까 스레드는 1개
	public static void main(String[] args) {
		ThreadTest1 t = new ThreadTest1(100);
		long all = 0;
		
		for(int i=0; i<=t.add; i++) {
			all += i;
			System.out.println(all);
		}
	}
}
*/
/*
public class ThreadTest1 extends Thread{
	long add = 0;
	String name;
	
	ThreadTest1(long a, String n){
		add = a;
		name = n;
	}
	/* Thread의 동작을 구현할 수 있는 메서드. 내맘대로 만든게 아니고 오버라이드한것
	 * 인쇄하기 기능, 총알피하기 기능 각각의 기능을 run 안에다 만듬
	 * 똑같은 run을 가지고 t1,t2를 만들어야해서 그게 불편하다. 나중에 따로 만들 수 있음
	 * 원래 main 스레드는 단순히 프로그램을 처음 시작하는 의미만으로도 충분하고 더 일시키면 안된다. 
	 * main 부모 스레드라고도 한다. 유일하게 하나만 존재여서. 자식스레드는 메인스레드 제외한 나머지들 *
	@Override
	public void run() {
		long all = 0;	//int all?
		
		for(int i=0; i<=add; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			all += i;
			System.out.println(name + ":" + all);
		}
	}
	
	public static void main(String[] args) {
		// TODO 멀티 Thread
		// 생성된 객체가 Thread가 됐다. 상속이 되었기 때문에 클래스 자체가 스레드가 되었다.
		// Thread의 모든것을 상속받아서 class ThreadTest1이 스레드가 되어버린거다.
		// Thread는 계속 만들 수 있다.
		ThreadTest1 t1 = new ThreadTest1(5, "첫번째 스레드");
		ThreadTest1 t2 = new ThreadTest1(5, "두번째 스레드");
		
		t1.start();
		t2.start();
		}
	}
*/

// 자식 스레드 끼리 다른일하는. 다른기능으로 다른 작업을 할 수 있는. 메인에게도 일을 시킨 버전
public class ThreadTest1 extends Thread{
	long add = 0;
	
	ThreadTest1(long a, String name){
		super(name);
		add = a;
	}
	
	@Override
	public void run() {
		// 여기서부터는 자식 스레드가 일을 하고있다.
		// getName으로 이름을 꺼내 올 수있다.
		System.out.println(getName() + "자식 스레드 시작");
		long all = 0;
		
		for(int i=0; i<=add; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			all += i;
			System.out.println(getName() + ":" + all);
		}
		System.out.println(getName() + " "
				+ "자식 스레드 종료");
	}
	
	public static void main(String[] args) {
		// TODO Thread클래스를 상속받아 스레드를 만드는 방법
		// 여기서부터 메인이 일을 하기 시작했다.
		System.out.println("메인 스레드 시작");
		
		// 내부적 이름이 이미 부모에 저장이 되있어서 꺼내서 쓰기만하면됨. getName
		ThreadTest1 t1 = new ThreadTest1(10, "first");
		ThreadTest1 t2 = new ThreadTest1(10, "second");
		t1.start();
		t2.start();
		
		for(int i=0; i<10; i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		
		System.out.println("메인 스레드 종료");
		}
	}

