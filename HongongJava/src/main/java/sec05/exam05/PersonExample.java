package sec05.exam05;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("1234567-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//final 필드는 수정이 불가능
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";
		p1.name = "홍삼원";
		System.out.println("수정된 이름 : " + p1.name); // 홍삼원
	}
}
