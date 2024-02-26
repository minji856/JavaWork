package sec01.exam04;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly(); //super.fly()
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly(); //super.fly()
		sa.land();
	}
}

/*
이륙합니다.
일반비행합니다.
초음속비행합니다.
일반비행합니다.
착륙합니다.
*/