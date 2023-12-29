public class RecursiveCall {
	int fact1(int num) {
		int result = 1; // 곱해야하니까 0 으로 하면 안됨 결과가져올 변수
		for(int i=1; i<=num; i++) {
			result *= i;
		}
		return result;
	}
	
	int fact2(int num) {
		int result = 0;
		
		if(num == 1)	// 종료 조건 이때 원위치로 돌아간다 처음엔 4로 들어가니까 건너간다
			return 1;
		
		result = fact2(num-1) * num;	// 일단 위치 저장하고 위로 건너감 이때는 -1 해서 3으로 건너감
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO 재귀호출
		RecursiveCall obj = new RecursiveCall();
		System.out.println("반복문 사용 : " + obj.fact1(4));
		System.out.println("재귀호출 사용 : " + obj.fact2(4));
	}

}
