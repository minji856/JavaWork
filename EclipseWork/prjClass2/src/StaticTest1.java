class StaticDemo1{
	int a;
	int b;
	static int c;
}
// static c 가 제일 먼저 만들어진다 클래스와 남남이라고 클래스 안에 없지 않다 있긴함
// a,b객체도 static c 공간을 쓸수 있고 또 다른 a,b도 c의 공간 쓸 수 있다
public class StaticTest1 {
	static int d;
	
	static void method1() {
		System.out.println("I'm method~");
	}
	
	public static void main(String[] args) {
		// TODO Static이란 무엇인가?
//		static int a; 매서드안에 static 선언 불가
		StaticDemo1.c = 100;	// 객체 따로 생성없이 바로 사용가능
		System.out.println(StaticDemo1.c);
		
		StaticDemo1 demo1 = new StaticDemo1();
		StaticDemo1 demo2 = new StaticDemo1();
		System.out.println(demo1.c);	// static일때 c가 이탤릭체로 변경됨. 생긴건 인스턴스 변수느낌
		System.out.println(demo2.c);
		
		demo1.c = 200;
		System.out.println(StaticDemo1.c);
		System.out.println(demo2.c);	// 같은 공간이기때문에 가능
		
		d = 300; // *같은 클래스 내에서는* 융통성있게 생략해도됨
		System.out.println(d);
		method1();
	}

}
