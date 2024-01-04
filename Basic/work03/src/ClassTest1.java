class ClassDemo {
	int m_no;
	double m_point;
}
 
public class ClassTest1 {
	int m_ival;
	double m_dval;
	//클래스 안에서 선언되서 m_ival는 전역변수 어디서나 쓸 수 있음
	//m_ival = 10; 기능이나 동작 X 선언만 해주는 곳 계획만 세워둔 것
	//class 멤버는 위 두개밖에 없음
	
	public static void main(String[] args){
		// 지역변수 int m_ival; 
		//m_ival = 10;
		//new ClassTest1().m_ival = 10;
		//System.out.println(new ClassTest1().m_ival);
		
		ClassTest1 i = new ClassTest1();
		i.m_ival = 10;
		System.out.println(i.m_ival);
		
		//i=100;
		/*int ival;
		ival = 10; 클래스 안에 있는게 아니므로 가능*/
		System.out.println("--------------------------------");
		
		
		ClassDemo e = new ClassDemo ();
		e.m_no = 7;
		e.m_point = 3.14;
		System.out.print(e.m_no + ", " + e.m_point);
	}
}
