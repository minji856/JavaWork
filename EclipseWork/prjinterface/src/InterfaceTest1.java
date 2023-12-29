//interface Inter1{
//	int a = 1;	// public static final
//	
//	void Inter1Method();
//}

class Inter1{
	static int a = 1;	// 일반 변수인데 추상 메서드는 객체 생성 못하니까 static 붙여주기
	
	abstract void Inter1Method();
}

public class InterfaceTest1 implements Inter1 {
	public/**/ void Inter1Method() {
		System.out.println("오버라이드됨.");
	}
	
	public static void main(String[] args) {
		// TODO 인터페이스 기본 문법
		System.out.println(Inter1.a);
		// Inter1.a = 10; 변경 불가
	}

}
