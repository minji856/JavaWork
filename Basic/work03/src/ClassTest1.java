class ClassDemo {
	int m_no;
	double m_point;
}

public class ClassTest1 {
	int m_ival;
	double m_dval;
	//Ŭ���� �ȿ��� ����Ǽ� m_ival�� �������� ��𼭳� �� �� ����
	//m_ival = 10; ����̳� ���� X ���� ���ִ� �� ��ȹ�� ������ ��
	//class ����� �� �ΰ��ۿ� ����
	
	public static void main(String[] args){
		// �������� int m_ival; 
		//m_ival = 10;
		//new ClassTest1().m_ival = 10;
		//System.out.println(new ClassTest1().m_ival);
		
		ClassTest1 i = new ClassTest1();
		i.m_ival = 10;
		System.out.println(i.m_ival);
		
		//i=100;
		/*int ival;
		ival = 10; Ŭ���� �ȿ� �ִ°� �ƴϹǷ� ����*/
		System.out.println("--------------------------------");
		
		
		ClassDemo e = new ClassDemo ();
		e.m_no = 7;
		e.m_point = 3.14;
		System.out.print(e.m_no + ", " + e.m_point);
	}
}