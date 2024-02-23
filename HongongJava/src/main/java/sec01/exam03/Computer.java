package sec01.exam03;

public class Computer extends Calculator{
	@Override // 메소드 이름이 다르면 컴파일 에러가 발생함 areaCircl(X)
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * r * r; // 자바 표준 API로 재정의
	}
}
