package sec04.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);
		
		// 타입이 맞지 않음
		// int result2 = myCom.sum1(1, 2, 3, 4, 5);

		// sum2는 배열 선언 없이 자유롭게 가능
		int result3 = myCom.sum2(1, 2, 3);
		// int result3 = myCom.sum2(new int[] {1, 2, 3}); 배열 선언도 가능
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
	}
}
