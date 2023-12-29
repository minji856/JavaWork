class SingletonDemo {
	private int i;
	
	private SingletonDemo() {}	// 생성자 호출을 막아버리면 객체 생성을 막는다
	
	private static SingletonDemo instance = new SingletonDemo(); // 하나만 만들어지게 하려면 static
	
	public static SingletonDemo getInstance() {
		return instance;
	}
} 
// 편의상 같은 파일이지만 아래 클래스랑 위랑 엄연히 다른 외부다
public class SingletonTest {
	public static void main(String[] args) {
		// TODO Singleton Pattern 
		// SingletonDemo demo1 = new SingletonDemo();
		// SingletonDemo demo2 = new SingletonDemo();	// 이 공간에선 못 막는다 생성자 호출을 막으면
		
		SingletonDemo demo1 = SingletonDemo.getInstance();	// 수십개를 만들어도 똑같은 주소
		SingletonDemo demo2 = SingletonDemo.getInstance();	
		SingletonDemo demo3 = SingletonDemo.getInstance();	
		System.out.println(demo1 == demo2); // 주소가 같으니까
	}
}
