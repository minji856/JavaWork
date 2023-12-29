class A{
	A(){
		// super();
		System.out.println("A생성자 호출됨");
	}
}

class B extends A{
	B(int i){
		// super();
		System.out.println("B생성자 호출됨");
	}
	
	B(){} // 인스턴스 변수가 들어가면 기본 생성자 무조건 적기. 오버로딩경우에
}

class C extends B{
	C(){
		// super();
		System.out.println("C생성자 호출됨");
	}
}

public class ConstructorOrderTest {
	public static void main(String[] args){
		// TODO 생성자 호출 순서} 
		new C();
	}
}
