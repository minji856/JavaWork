// 일종의 동경의 의미로 t를 암묵적으로 쓴다
class GenericDemo<T>{
	// 미리 형식을 결정하지 않고, 실행중에 형식을 결정하겠다 C++ 템플릿 문법
	T value;
	
	public GenericDemo(T val) {
		value = val;
	}
	
	T getValue() {
		return value;
	}
}

//class GenericDemo{
//	int value;
//	// 인자있는 생성자
//	public GenericDemo(int val) {
//		value = val;
//	}
//	
//	int getValue() {
//		return value;
//	}
//}


public class GenericTest2 {
	public static void main(String[] args) {
		// TODO Template 기능
//		GenericDemo demo1 = new GenericDemo(10); 기존 클래스
		// 클래스가 generic이여서 이제 정수형(integer)도 사용가능
		GenericDemo<Integer> demo1 = new GenericDemo<Integer>(10);
		System.out.println(demo1.getValue());
		
		/* 무조건 정수형만 가능한 함수. 
		 * 실수값,문자열 등 처리하고 싶다 만능클래스로 만들고 싶다
		 * => 클래스를 generic 클래스로 만들면 만능이 된다 */
		GenericDemo demo2 = new GenericDemo(3.14);
		System.out.println(demo2.getValue());
		
		GenericDemo demo3 = new GenericDemo("이것은 제너릭");
		System.out.println(demo3.getValue());
	}

}
