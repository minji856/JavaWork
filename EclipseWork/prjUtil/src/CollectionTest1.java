import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTest1 {
	public static void main(String[] args) {
		// TODO Set계열의 클래스들
		HashSet set = new HashSet();
		// HashSet이 만든건 참조할 수 없고 부모니까 Set으로도 가능은 함.
//		Set set = new HashSet();
		set.add("carrie");
		set.add("kabbin");
		set.add("kairo");
		set.add("kairo");
		set.add("kariss");
		
		// 자동으로 kairo는 중복이라서 1개만 저장됨
		System.out.println("데이터 개수 : " + set.size());
		// 순서대로 정렬, 저장을 안함 순서정렬은 또다른 퍼포먼스라서 최대한 줄이겠다
		System.out.println(set);
		
		// 데이터를 열거형태로 만들기 set공간에선 바로 꺼내서 못 쓰니까
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		TreeSet tree = new TreeSet();
		tree.add("juliet");
		tree.add("terry");
		tree.add("kabbin");
		tree.add("terry");
		tree.add("carrie");
		
		System.out.println("데이터 개수 : " + tree.size());
		System.out.println(tree);
	}

}
