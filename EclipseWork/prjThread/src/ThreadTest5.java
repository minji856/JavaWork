class Toilet {
	public synchronized void openDoor(String name) {
		// 누가 문열고 화장실을 들어왔는지 모니터링을 하기위해 매개변수 name
		System.out.println(name + " 입장");
		
		// 일을 보는 시간은 사람마다 다르듯이
		for(int i=0; i<10000; i++) {
			if(i == 5000) {
				System.out.println(name + " : 끄응 ~~"); 
			}
		}
		// 한번에 하나의 스레드만
		System.out.println(name + "퇴장");
	} 
}

// 이 가족이 결국 스레드인격
class Family extends Thread{
	Toilet toilet;
	String who;
	// 누가 화장실을 들어갔는지
	
	Family(Toilet t, String w){
		toilet = t;
		who = w;
	}
	/* 동기화가 안되면 내가 볼일보는데 가족이 막 들어오는
	 * run 메서드로 화장실을 가게하는 */
	@Override
	public void run() {
		toilet.openDoor(who);
	}
}

public class ThreadTest5 {
	public static void main(String[] args) {
		// TODO 동기화
		Toilet t = new Toilet();
		// 화장실 주소가 생김
		
		// 가족도 만들어주기
		Family father = new Family(t, "아버지");
		Family mother = new Family(t, "어머니");
		Family brother = new Family(t, "형");
		Family sister = new Family(t, "누나");
		Family me = new Family(t, "나");
		
		father.start();
		mother.start();
		brother.start();
		sister.start();
		me.start();
	}
}
