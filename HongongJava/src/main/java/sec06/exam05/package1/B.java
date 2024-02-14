package sec06.exam05.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1; private 필드라 다른 클래스에서 접근 불가
		
		a.method1();
		a.method2();
		// a.method3(); private 메소드라 다른 클래스에서 접근 불가
	}
}
