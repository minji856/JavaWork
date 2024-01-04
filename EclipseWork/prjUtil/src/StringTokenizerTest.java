import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO 문자열 분리
		// 1개의 데이터 이름이 4개라고 4개아님
		String data = " 홍길동, 임꺽정, 신돌석, 강감찬 ";
		// split 리턴값 자체가 문자열 배열이디
		// 배열이니까 split(",").trim 못 쓴다
		String[] names = data.split(",");
		// 홍길동, 임꺽정, 이런식으로 , 뒤에 공백이 있다
		for(String name : names) {
			System.out.println(name.trim());
		}
		/* 복잡하거나 큰 범위 내에서 분리 시킬 수 있는. 객체
		 * 간단한 문자열은 굳이 안 써도됨 split과 규모의 차이 */
		StringTokenizer token = new StringTokenizer(data, ",");
		// 몇개로 분리 됐는지
		System.out.println(token.countTokens());
		// 배열은 아닌데 배열이랑 비슷하게 돌아간다
		
		/* while로 반복 돌려야해서 주석처리
		System.out.println(token.nextToken());
		System.out.println(token.nextToken());
		System.out.println(token.nextToken());
		System.out.println(token.nextToken());
		*/
		
		// 이미 순서대로 나열(열거형)되있어서 인덱스도 필요없다.
		// 없을때 까지 꺼내오기 이미 위에서 끝까지 가버려서 밑에 while문이 안나온다 그래서 주석처리해주기
		// 꺼내온 값은 문자열(String)
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken().trim());
		}
		
		// data1은 , 하나로 해결이 가능했지만 split으로 해결 못한다. 할꺼면 정규표현식으로
		String data2 = "홍길동+ 임꺽정* 신돌석? 권율~ 강감찬";
		token = new StringTokenizer(data2, "+*?~");
		
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken().trim());
		}
		
		String data3 = "JavaTM 언어사양 제2판:James Gosling, Bill Join, " +
				"Gilad Bracha:무라카미 마사키:피어슨 에듀케이션:2000:5500";
		/* 
		 * 책 제목: JavaTM 언어사양 제2판
		 * 저자:James Gosling,
		 * 		 Bill Join
		 * 		Gilad Bracha
		 * 역자: 무라카미 마사키
		 * 출판사: 피어슨 에듀케이션
		 * 출판년도: 2000
		 * 가격: 5500
		 * 	*/
		token = new StringTokenizer(data3, ":,");
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken().trim());
		}
		// 실습
		String[] info = new String[8];
		token = new StringTokenizer(data3, ":,");
		for(int i = 0; token.hasMoreTokens(); i++) {
			info[i] = token.nextToken().trim();
			System.out.println(info[i]);
		}
			System.out.println("책 제목 : " + info[0]);
			System.out.println("저자 : " + info[1] + "," + "\n" + "      "+ info[2] 
					+ "," + "\n" + "      " + info[3]);
			System.out.println("역자 : " + info[4]);
			System.out.println("출판사 : " + info[5]);
			System.out.println("출판년도 : " + info[6]);
			System.out.println("가격 : " + info[7]);
	}

}
