interface Volume {
	void volumeUp(int vol);
	void volumeDown(int vol);
}

class TV implements Volume {
	private int vol;
	
	@Override
	public void volumeUp(int vol) {
		this.vol = vol;
		System.out.println("현재 TV볼륨을 " + this.vol + "만큼 올렸습니다.");
	}
	
	@Override
	public void volumeDown(int vol) {
		this.vol = vol;
		System.out.println("현재 TV볼륨을 " + this.vol + "만큼 내렸습니다.");
	}
	}

class Radio implements Volume {
	private int vol;
	
	@Override
	public void volumeUp(int vol) {
		this.vol = vol;
		System.out.println("현재 라디오 볼륨을 " + this.vol + "만큼 올렸습니다.");
	}
	
	@Override
	public void volumeDown(int vol) {
		this.vol = vol;
		System.out.println("현재 라디오 볼륨을 " + this.vol + "만큼 내렸습니다.");
	}
}

class Power {}

public class InterfaceTest3 {
	public static void main(String[] args) {
		// TODO 인터페이스 응용 프로그램
		/*
		 * 1. Power 인터페이스를 작성하여 오버라이딩 한다.
		 * 2. 소리를 높일 때 50이상 넘지 않게 한다.
		 * 3. 소리를 낮출 때 0미만으로 줄일 수 없게 한다.(0은 뮤트기능)
		 * 4. 소리를 켜거나 줄일 때 반드시 전원이 켜져 있을 때에만 가능하게 한다.
		 * 
		 * ****실행 예시
		 * 제품 선택
		 * 1.TV
		 * 2.Radio
		 * 선택 :
		 * 
		 * ...
		 * tv 전원을 키시겠습니까?(y/n) :
		 * 전원이 켜져있다면
		 * 1. 소리증가
		 * 2. 소리 감소
		 * 3. 음소거
		 * 선택 :
		 * 
		 * 똑같이 안해도됨
		 * */
	}
}
