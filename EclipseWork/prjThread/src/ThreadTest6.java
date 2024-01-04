import java.util.Stack;

class AutoMachine {
	Stack store = new Stack();
	// 관리자가 자판기 안에다가 음료수를 넣기 위한 기능
	synchronized void putDrink(String drink){
		store.push(drink);
		notify();	// 자판기에서 음료수 꺼내먹는 일을 해라 그만쉬고.
	}
	
	// 음료수를 꺼내먹는 기능 넣다 뺏다해야하니까 collection? 
	// stack을 이용해서 음료수가 쌓이고 꺼내올땐 위에서 꺼내오는
	// void getDrink 였었다.
	synchronized String getDrink(){
		// 만약 자판기가 비어있으면 휴게실 가있어라 얼씬도 하지마라
		while(store.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return store.pop().toString();
		// 소비자에게 줘야하니까 return
	}
}

// 얘가 스레드가 되는것
class Producer extends Thread{
	private AutoMachine auto;	// 자판기 주소
	
	public Producer(AutoMachine auto) {
		this.auto = auto;
	}
	
	// 음료수를 채우는 기능 runnable은 자동으로 override 해준다 그게 차이
	// getName은 기본으로 있는 이름
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName() + " : 음료수 No." + i + " 채워넣음");
			auto.putDrink("음료수 No." + i);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {
	private AutoMachine auto;	// 당연히 소비자도 자판기 위치를 알아야한다
	public Consumer(AutoMachine auto) {
		this.auto = auto;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName() + " : 음료수 No." + i + " 꺼내먹음");
			auto.getDrink(); // 꺼내먹는거니까 매개변수가 필요없다.
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest6 {
	public static void main(String[] args) {
		// TODO wait, notify
		AutoMachine auto = new AutoMachine();
		Producer hong = new Producer(auto);
		Consumer kim = new Consumer(auto);
		
		hong.start();
		kim.start();
	}

}
