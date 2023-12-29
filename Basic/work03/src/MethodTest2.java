//인자 전달 방식
/*
class MethodTest2 {
	void swap(int num1, int num2){
		int temp = num1;	//num1을 미리 옮겨두는 작업
		num1 = num2;
		num2 = temp;
	}
	
	public static void main (String[] args){
		int num1 = 10, num2 = 15;
		
		System.out.println("두 수의 교환");	//정렬하기위해 2개씩 자리를 바꿔서 큰거를 오른쪽으로 보내던가
		new MethodTest2().swap(num1, num2); //주소를 전달해주면 내가 원하는 위치에서 값이 변한다 return으로 해결할 수 없을때
		
		System.out.println("num1 " + num1 + ", num2 " + num2);
	}
}
*/
public class MethodTest2 {
	int num1 = 10, num2 = 15;	//변수를 인스턴스 변수로 선언
	
	void swap(MethodTest2 m){	//m2.swap(m2) 값을 가져온다
		int temp = m.num1;	
		m.num1 = m.num2;
		m.num2 = temp;
	}
	
	public static void main (String[] args){
		System.out.println("두 수의 교환");	
		MethodTest2 m2 = new MethodTest2(); //주소가 생성이 됨
		m2.swap(m2);
		
		System.out.println("num1= " + m2.num1 + ", num2= " + m2.num2);
	}
}