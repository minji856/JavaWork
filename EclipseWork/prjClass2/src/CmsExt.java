public class CmsExt extends Cms{
	private String address;
	String name;

	public CmsExt(int no, String name, char level, String address) {
//		this.no = no;
//		this.name = name;
//		this.level = level;
		
		/* no, name, level의 변수가 없는데도 상속으로 인하여 쓸 수 있다
		setNo(no);
		setName(name);
		setLevel(level);
		*/
		
		// 부모의 주소를 알고있는 매서드 호출
		super(no, name, level);
		this.name = "자식";	// 내가 만든 변수
		this.address = address;	// address 빼고 위 변수를 부모에게 넘겨주자
		// super(no, name, level); 생정자가 여기에 들어가면 안된다
	}
	/*
	void print() {
		display();		// 매서드 생성이 안되있는데 매서드를 쓸 수가 있다
		System.out.println("고객 주소:" + address);
		System.out.println("고객 이름:" + super.name + ", " + this.name);	// 부모한테 저장시켜놓은 이름
	}*/
	
	// 안 쓰고 바로 메서드 써도되는데 고쳐서 사용하려고
	void display() {
		/*
		System.out.println("고객 번호:" + getNo());
		System.out.println("고객 이름:" + name);
		System.out.println("고객 등급:" + getLevel());
		*/
		super.display();	// 내가 만든 display 말고 부모가 만든 display 호출해라
		System.out.println("고객 주소:" + address);
	}
}
