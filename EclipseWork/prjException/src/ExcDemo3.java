
public class ExcDemo3 {
	public static void main(String[] args) {
		// TODO 
		int [] arr = new int[3];
		
		System.out.println("Exception 실행 예제...");
		try {
			arr[7] = 10;
		}
		
		catch (Exception err) {
			System.out.println("오류 발생" + err);
			// 계속 프로그램을 실행시키지 않으니까 에러가 발생하면 return 거기서 종료해라란 의미 //
			// 가상머신이 메인을 호출했으니까 다시 메인으로 돌아간다.
			return;
			
			// 요즘엔 거의 추천하지않는. 프로그램 강제 종료 finally 마저도 실행이 안되는
//			System.exit(0); 
		}
		/* 에러가 나던 안나던 무조건 실행하는 코드. 무조건 try,catch 밑에 적기
		 * 반드시 실행되어야하는 코드들을 안전하게 보장받을 수 있다.
		 * 에러가 발생하면 나머지 코드도 의미가 없는 경우가 많다.
		 * return을 써도 finally는 실행이 된다. */
		finally {
			System.out.println("이곳은 반드시 실행되는 영역이다.");
		};
		
		System.out.println("이 문장이 보이는가?");
	}

}
