
public class StaticTest2 {
	StaticTest2(){
		System.out.println("생성자 호출됨 : 인스턴스 생성");
	}
	
	static double d1, d2;
	static String str;
	
	static {
		d1 = Math.sqrt(4.0);	// java.lang.Math 객체 생성하지않고 바로 함수 왜? static으로 만들어져있기때문에
		d2 = Math.sqrt(8.0);
		str = "문자열";
		System.out.println("static 생성됨");
		
	}
	
	public static void main(String[] args) {
		// TODO static과 생성자의 호출 순서
		new StaticTest2();
		System.out.println(d1 + ", " + d2 + ", " + str);
	}

}
