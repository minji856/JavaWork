class MethodTest {
	int sum(int num1,int num2){
		System.out.println("�� ���� �հ�");
		int result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args){
		int num1 = 10, num2 = 15;
		//�� result�� �ٸ� result �̸� ���Ƶ� ok
		int result = new MethodTest().sum(num1, num2);
		System.out.println("��� : " + result);
	}
}
						//num1�� ���� ���� ���� 10;

//�ּҿ� ���� ���� �ǽ�
/*class MethodTest {
	int num1 = 10, num2 = 15;
	
	int sum(MethodTest m){
		int m = m.num1 + m.num2;
	}
	
	public static void main(String[] args){
		System.out.println("�� ���� �հ�");
		MethodTest m1 = new MethodTest();
		m1.sum(m1);
		System.out.println("��� : " + m1.num1 + m1.num2 );
	}
}*/
