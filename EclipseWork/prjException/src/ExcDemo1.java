/*
public class ExcDemo1 {
	public static void main(String[] args) {
		int [] arr = new int[3];
		
		System.out.println("Exception 실행 예제...");
		// 문법적으로 에러가 발생하지않는다. 배열
		// 가벼운 에러라도 무조건 멈춰버린다
		// 문법적 지원이 필요하다 : 예외처리
		arr[7] = 10;
		
		System.out.println("이 문장이 보이는가?");
	}
}*/
/* 예외에 대한 타입 자바에선 온갖 예외에 대해서 유형별로 다 만들어놨다.
		 * Exception 이름을 잘 적어야한다 */
public class ExcDemo1 {
	public static void main(String[] args) {
		// TODO 예외처리
		int [] arr = new int[3];
		
		System.out.println("Exception 실행 예제...");
		// 지금은 어디서 예외가 발생할건지 아니까
		try {
			arr[2] = 10;
			//...
			// 0이 들어올지 생각지도 못할수도있다 0을 나누는건 원래 불가능
			// 사용자가 갑자기 0을 잘못 입력할 수도 있다.
			double d = 10/0; 
		}
		/* ArithmeticException err 산술연산 에러가 난다 exception은 부모니까 가능했던것
		 뭐때문에 에러가 발생했는지 모르니까 구체적으로 어떤 에러가 발생할지 정확히 알 수 있다
		 try catch를 쓰지말고 일단 에러를 내보면 힌트가 나온다
		 ArrayIndexOutOfBoundsException 이걸로 잡으면 된다.
		 저 많은것들 중 뭐가 뭔지 알고 쓸꺼냐 - 에러내보기 */
		/*
		catch (ArrayIndexOutOfBoundsException err){
			System.out.println("배열의 범위를 벗어났습니다.");
		}
		// 다중 catch 예러가 하나만 나는 법이 없으니까
		catch (ArithmeticException err) {
			System.out.println("산술 연산을 잘못했습니다.");
		}
		
		catch (RuntimeException err) {
			System.out.println("실행 중 오류발생");
		}*/
		// 어떤 오류인지 구체적으로 모르니까 그냥 오류 발생 err.toString이 생략된거
		// 에러가 발생은 했는데 원인이 무엇인지 뿌려준다
		catch (Exception err) {
			System.out.println("오류 발생" + err);
		}
		System.out.println("이 문장이 보이는가?");
	}
}