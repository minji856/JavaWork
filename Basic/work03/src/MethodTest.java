class MethodTest {
	int sum(int num1,int num2){
		System.out.println("두 수의 합계");
		int result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args){
		int num1 = 10, num2 = 15;
		//위 result와 다른 result 이름 같아도 ok
		int result = new MethodTest().sum(num1, num2);
		System.out.println("결과 : " + result);
	}
}
						//num1은 값에 의한 전달 10;

//주소에 의한 전달 실습
/*class MethodTest {
	int num1 = 10, num2 = 15;
	
	int sum(MethodTest m){
		int m = m.num1 + m.num2;
	}
	
	public static void main(String[] args){
		System.out.println("두 수의 합계");
		MethodTest m1 = new MethodTest();
		m1.sum(m1);
		System.out.println("결과 : " + m1.num1 + m1.num2 );
	}
}*/
