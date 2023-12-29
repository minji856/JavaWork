// TODO 상속을 위한 샘플 프로그램 - 고객 관리 프로그램
public class Cms {
	private int no;			// int no;
	String name;		// 실습땜에 private 뺌
	private char level;
		
	public Cms(int no, String name, char level) {
		this.no = no;
		this.name = name;
		this.level = level;
	}
	// 필요없어도 항상 기본 생성자 명시
	Cms(){};
	
	// private 썻을 때 getter, setter
	int getNo() {
		return no;
	}
	
	void setNo(int no) {
		this.no = no;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public char getLevel() {
		return level;
	}
	
	public void setLevel(char level) {
		this.level = level;
	}
	
	void display() {
		System.out.println("고객 번호:" + no);
		System.out.println("고객 이름:" + name);
		System.out.println("고객 등급:" + level);
	}
}
