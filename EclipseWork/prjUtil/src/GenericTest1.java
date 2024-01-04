import java.util.Vector;

public class GenericTest1 {
	public static void main(String[] args) {
		// TODO 타입을 미리 체크
		
		/* List계열. 추가를 하고 있는 과정이라고 생각 
		Arraylist로 써도되긴하는데 vector의 특징이있음 
		문자열만 저장해야된다고 가정하고 숫자를 넣었다고 생각해보기 */
		// Vector<Integer> v = new Vector<String>(); 비객체형 쓰려면 wrapper 클래스
		Vector<String> v = new Vector<String>();
		v.add("hello");
		v.add("world");
		v.add("홍길동");
		//... 코드를 오래 짜는중 실수로 문자열 데이터에 숫자를 넣음 오류는 안나고 그래서 generic 사용
//		v.add(100); 
		
		/* 문자열로 캐스팅해서 뭔가 문자열로 쓸 때
		 	이때 숫자값때문에 오류가 난다.
		String str = null;
		for(int i=0; i<v.size(); i++) {
			str = (String)v.get(i);
			System.out.println(str);
		}
		*/
		
		for(String str : v) {
			System.out.println(str);
		}
	}

}
