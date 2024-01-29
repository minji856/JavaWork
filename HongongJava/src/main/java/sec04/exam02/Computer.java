package sec04.exam02;

/**
 * 매개 변수의 개수를 모를 경우
 */
public class Computer {
	// 배열의 항목 수는 호출할 때 결정된다
	int sum1(int[] values) {
		int sum = 0;
		for(int i =0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i =0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
