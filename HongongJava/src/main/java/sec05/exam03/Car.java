package sec05.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		// speed = 60; 인스턴스 필드 바로 사용 불가
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
