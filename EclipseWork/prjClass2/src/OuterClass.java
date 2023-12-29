// 내부 클래스가 *static*일 경우
//public class OuterClass {
//	private int outer1;
//	
//	static class InnerClass{
//		private int inner1;
//		
//		void innerMethod() {
//			System.out.println("innerMethod() 호출됨");
//			
//			OuterClass oc = new OuterClass();	// 안에 들어와있어도 객체는 생성 해줘야한다.
//			oc.outer1 = 200;
//			System.out.println(oc.outer1);
//			
////			outer1 = 200; 객체 생성안하고 하는건 에러난다
//			
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO 중첩 클래스
//		InnerClass ic = new InnerClass();
//		ic.innerMethod();
//		ic.inner1 = 100;	// private 도 접근할 수 있다 같은 클래스? 라서
//		System.out.println(ic.inner1);
//	}
//}

// 내부 클래스가 *일반 클래스*일 경우
public class OuterClass {
	private int outer1;
	
	class InnerClass{
		private int inner1;
		
		void innerMethod() {
			System.out.println("innerMethod() 호출됨");
			
//			OuterClass oc = new OuterClass();	// 안에 들어와있어도 객체는 생성 해줘야한다.
//			oc.outer1 = 200;
//			System.out.println(oc.outer1);
			
			outer1 = 200; // 바깥에 있는데 자기것 처럼 쓸 수 있다. 근데 제대로 설계 안하면 데이터가 중복됨
			System.out.println(outer1); // (39-41 주석처리)객체 생성 안해도
		}
	}

	public static void main(String[] args) {
		// TODO 중첩 클래스
//		OuterClass oc = new OuterClass();
//		InnerClass ic = oc.new InnerClass();
		InnerClass ic = new OuterClass().new InnerClass(); // 같은 클래스 안에서 작업하니까 클래스 생략해도됨 원래는 써줘야함
		ic.innerMethod();
		ic.inner1 = 100;	// private 도 접근할 수 있다 같은 클래스? 라서
		System.out.println(ic.inner1);
	}
}

