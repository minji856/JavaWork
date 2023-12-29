import java.io.IOException;

public class ExcDemo5 {
	static void second() throws IOException, ArithmeticException {
		System.out.println("second 호출됨");
		
		int i = System.in.read();
		int j = i/5;
//		int j = i/0; 처음에 쓴 예제
		
		// 일부러 에러를 발생시켜서 first로 넘겨준다
		throw new ArrayIndexOutOfBoundsException();
	}
	
	static void first() throws IOException, ArithmeticException {
		// second에 있던 에러가 대신 first로 옮겨짐 -second() throws IOException 적으면 
		// 또 first() throws IOException 하면 메인에게 대신 처리가 넘어가게 된다.
		// second는 first 한테 요청한 것임
		System.out.println("first 호출됨");
		
		second();
	}
	
	public static void main(String[] args) {
		// TODO printStackTrace
		try {
			first();
		}
		// catch를 exception으로 바꿔줌 (2개의 예외를 넣어서)
		catch (Exception err) {
			System.out.println("main에서 다 처리함..." + err);
			// 어디서 에러가 났는지 알려주는 함수 printStackTrace
			// stack에 있는 순서대로 second부터 꺼내고 그다음 first 다음 main
			err.printStackTrace();
		}
	}

}
