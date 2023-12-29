class First{
	int a = 10;
	
	void display() {
		System.out.println("a : " + a);
	}
}

class Second extends First{
	int b = 20;
	
	void show() {
		System.out.println("b : " + b);
	}
}

public class ReferenceTest {
	public static void main(String[] args) {
		// TODO 부모 클래스와 자식 클래스의 참조 관계
		First f1 = new First();
		f1.display();
		
		Second s1 = new Second();
		s1.show();
		
		First f2 = f1;	// 같은 클래스니까 하나의 객체를 두 변수가 참조할 수 있게. 새로 생성 X
		f2.display();
		
//		f2 = (First)s1;	// 서로 다른 클래스는 비슷하게 생겨도 독립적이다 절대 참조 불가
		f2 = s1;	// extend 해준 후
		
		//Second s2 = (Second)f1; // 컴파일때 문법적 오류만 피한거고 실행은 안된다
		
		f2.a = 30;
		f2.display();
		
		// f2.b = 40;
		
		Second s3 = (Second)f2;		// 32행과 차이 변수는 부모타입이지만 자식을 참조하고 있어서 캐스팅해서 원래대로
		s3.display();
		s3.b = 40;
		s3.show();
	}

}
