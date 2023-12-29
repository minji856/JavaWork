public class StringTest {
	public static void main(String[] args){
		String[] names = new String[10];	//char 일때는 불가
		names[0] = "Tom";
		names[1] = "Johnson";
		names[2] = "Marry";
		
		System.out.println(names[0]);
		
		/////////////// String 클래스 사용법 ////////////////
		
		// 대괄호가 없어서 String을 변수처럼 쓰는. 어떤 방법이던 써도 됨
		String str = new String();
		str = "홍길동";
		System.out.println(str);
		
		String str2 = new String("임꺽정");
		System.out.println(str2);
		
		String str3 = "강감찬";
		System.out.println(str3);
		
		/////////////// String 클래스 APIs ////////////////
		
		String s1 = "java";
		//String s2 = "java";	 //같은 문자열이니까 같은 위치를 공유한다 같은 주소가 같다고 나온거다
		String s2 = new String("java");  	// 주소를 비교하는거다. 둘다 주소비교는 맞는데 얘는 다른 주소
		
		//if(s1 == s2)
		//	System.out.println("s1과 s2는 같다.");
		//else 
		//	System.out.println("s1과 s2는 다르다.");
		
		if(s1.equals(s2))
			System.out.println("s1과 s2는 같다.");
		else 
			System.out.println("s1과 s2는 다르다.");
		
		System.out.println("Java".equalsIgnoreCase(s2)); // 대소문자 상관없이 값 비교
		
		String s3 = "java is beautiful";
		String s4 = "java just one";
		
		System.out.println(s3.compareTo(s4));	//-1 s3.i랑 s4.j랑 다르다 어느 쪽이 아스키코드가 더 큰지
		
		System.out.println(s3.charAt(3)); //a
		
		System.out.println(s3.indexOf("is")); //5
		System.out.println(s3.indexOf("a")); //1
		System.out.println(s3.lastIndexOf("a")); //10
		System.out.println(s3.indexOf("love")); // 없는 문자면 -1
		
		System.out.println(s3.substring(5, 6)); //i
		System.out.println(s3.substring(5)); //is beautiful
		
		String[] sp = s3.split(" ");
		for(String s : sp){
			System.out.println(s);
		}
		//옛날버전
		for(int i=0; i<3; i++){
			System.out.println(sp[i]);
		}
		
		/////////////// 불변성 ////////////////
		String s5 = "javu";
		s5 = "java"; // 고치는게 아니라 새로운 문자열 객체가 만들어지는거다 100번지를 버리고 200번지를 찾아감
		System.out.println("s5 : " + s5);
		
		String s6 = s5.concat(" is number one");	//새로운 문자열이 새로 만들어짐 java에 만들어진거 X
		System.out.println(s6);
		System.out.println(s5 == s6);
		
		StringBuffer s7 = new StringBuffer("java");
		s7.append(" is number one");
		StringBuffer s8 = s7.append(" is number one");
		System.out.println(s7 == s8); // 주소가 같다고 나온다
	
	}	
}