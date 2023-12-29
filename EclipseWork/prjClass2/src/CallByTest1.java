/*
public class CallByTest1 {
	void display(int a, int b, int c, int d, int e) {
		System.out.println(a + ", " + b + ", " + c + ", " + d
				+ ", " + e);
	}
	
	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달1
		int a=4, b=7, c=15, d=80, e=9;
		
		CallByTest1 call = new CallByTest1();
		call.display(a, b, c, d, e);
	}

}
*/
/*
// 배열을 이용하는 방법
public class CallByTest1 {
	void display(int [] arr) {
		for(int a : arr) {
			System.out.println(a);
		}
	}
		// int[] arr 아무이름
	
	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달1
		int a=4, b=7, c=15, d=80, e=9;
		int arr[] = {4, 7, 15, 80, 9};
		
		CallByTest1 call = new CallByTest1();
		call.display(arr);
	}
}
*/

// 인스턴스 변수을 이용하는 방법 참조에 의한 전달이라고 보긴 조금 무리
/*
public class CallByTest1 {
	int a=4, b=7, c=15, d=80, e=9;
	
	void display() {
		System.out.println(this.a + ", " + b + ", " + c + ", " + d
				+ ", " + e);
	}
	
	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달1
		CallByTest1 call = new CallByTest1();
		call.display();
	}
}
*/

//가급적 별도로 만들어 주는게 좋다

class ArgData{
	int i = 4;
	double d = 3.14;
	char c = '가';
	boolean b = true;
	String s = "홍길동";
}

public class CallByTest1 {
	 void display(ArgData data) {
	        System.out.println(data.i + ", " + data.d + ", " + data.c+ ", " +
	        			data.b + ", " + data.s);
    }
	
	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달1
		ArgData data = new ArgData();
		
		CallByTest1 call = new CallByTest1();
		call.display(data);
	}
}