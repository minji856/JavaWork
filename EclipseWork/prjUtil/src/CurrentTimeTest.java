public class CurrentTimeTest {
	public static void main(String[] args) {
		// TODO 시간 차이 구하기 : System.currentTimeMillis()
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for(long i=0; i<100000000000L; i++) {
			sum += 1;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("걸린 시간 : " + (end-start)/1000); // 초 단위로 보고싶으면 1000으로 나누기
	}

}
