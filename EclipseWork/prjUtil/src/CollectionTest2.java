import java.util.ArrayList;

public class CollectionTest2 {
	public static void main(String[] args) {
		// TODO List계열의 클래스들
		
		ArrayList list = new ArrayList();
		list.add("carrie");
		list.add("kairo");
		list.add("kabbin");
		list.add("kairo");
		list.add("terry");
		
		// 중복인 kairo도 저장이됨 
		System.out.println("데이터 개수 : " + list.size());
		System.out.println(list);
		
		// 그냥 꺼내서 반복문 돌려도 된다 set이랑 차이점
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		if(list.contains("kairo")) {
			System.out.println("찾았다.");
			System.out.println(list.indexOf("kairo") + "번째 있다.");
		}
		else {
			System.out.println("못 찾았다.");
		}
		// 문자 아니여도 데이터들을 다 추가할 수 있다.
		list.add(2, 100.5);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
	}

}
