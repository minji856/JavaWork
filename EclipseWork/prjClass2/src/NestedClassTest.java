
public class NestedClassTest {
	public static void main(String[] args) {
//		// TODO 중첩 클래스 활용 테스트
//		// 내부클래스가 static일 경우			 다른 파일에 있는 클래스에 접근연산자
//		OuterClass.InnerClass ic = new OuterClass.InnerClass();	// 이름을 똑같이 써야함
//		ic.innerMethod();
//		// ic.inner1 = 100;
//		// System.out.println(ic.inner1);
		
		// 내부 클래스가 General일 경우
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.innerMethod();
	}
}

