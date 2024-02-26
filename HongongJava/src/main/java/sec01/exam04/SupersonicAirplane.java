package sec01.exam04;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	public void fly() {
		//fly() 메소드 재정의
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly(); //Airplane 객체(부모)의 fly()메소드 호출
		}
	}
}
