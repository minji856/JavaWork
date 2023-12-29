
public class ExcDemo4 {
	public static void main(String[] args) {
		// TODO throw
		try {
			System.out.println("여기는 try블럭 내부이다.");
			// exception은 클래스니까 객체를 new를 통해 생성해서 에러를 일부러 내서 던져주는거다.
			// 던져준것을 catch가 받아준다.
			// 객체안에 무언가 인자값을 같이 전달해 주면 catch에 err.getMessage()
			throw new RuntimeException("이것은 테스트용이다.");
		}
		
		catch(RuntimeException err) {
			System.out.println("예외 처리딤... : " + err.getMessage());
		}
	}

}
