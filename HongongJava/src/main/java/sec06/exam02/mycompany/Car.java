package sec06.exam02.mycompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {
	// 필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
	/* Tire가 중복이여서 하나만 객체가 생성되고 컴파일 에러가 난다
	Tire tire3 = new Tire(); kumho.Tire
	Tire tire4 = new Tire(); // 에러 hankook.Tire 
	*/
}
