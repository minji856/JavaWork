package sec03.exam02;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		// 생성자에서 필드 초기화 해서 값을 안 넣어도 "대한민국" 이라고 출력됨
		System.out.println("k1.nation : " + k1.nation);
		
		Korean k2 = new Korean("김자바", "960525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		// 생성자에서 필드 초기화 해서 값을 안 넣어도 "대한민국" 이라고 출력됨
		System.out.println("k2.nation : " + k2.nation);
	}
}
