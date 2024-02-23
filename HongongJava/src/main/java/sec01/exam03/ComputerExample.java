package sec01.exam03;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		// 자식 클래스에서 재정의된 메소드를 호출하면 부모 메소드는 숨겨진다
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
	}
}
