import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionTest3 {
	public static void main(String[] args) {
		// TODO Map
		// key는 중복되면 안 된다 
		HashMap map = new HashMap();
		map.put("k1", "홍길동");
		map.put("k2", "임꺽정");
		map.put("k3", "유비");
		map.put("k4", "관우");
		map.put("k5", "장비");
//		map.put("k1", "장비"); 에러가 나오지않으니까 마지막 데이터가 k1으로 들어감
		
		System.out.println("데이터 개수 : " + map.size());
		System.out.println(map);
		
		System.out.println(map.get("k2"));
		
		// 왜 이렇게 되는지 알아야함. 부모자식의 참조관계에 의해서
		// (String) 써도되고 map은 안되는데 set인 부모로
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());	// 키값만 가져온다
			String key = (String)it.next();
			System.out.println(map.get(key));
		}
	}

}
