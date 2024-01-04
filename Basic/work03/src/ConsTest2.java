class ConsDemo2 {
	int iVal;
	double dVal;
	 
	ConsDemo2(int i, double d){
		iVal = i;
		dVal = d;
	} 
	
	//기본 생성자 안 그러면 오류가 남. 내용이 없더라도 적어주기
	ConsDemo2(){} 
	
	// 매서드 생성
	void setVal(int i, double d){
		/*
		검증 코드
		*/
		iVal = i;
		dVal = d;
	} 
}

public class ConsTest2 {
	public static void main(String[] args){
		ConsDemo2 ob = new ConsDemo2();
		System.out.println(ob.iVal);
		
		//int i;
		//System.out.println(i);
		
		//검증 코드
		/*
			100이 문제가 있는지 없는지 검증
		*/
		//ob.iVal = 100;
		//ob.dVal = 10.0;
		
		//변수이름 몰라도된다
		ob.setVal(100, 10.0); 
		
		ConsDemo2 ob2 = new ConsDemo2(100, 10.0);
				//주소를 저장하는 참조변수
	}
}

