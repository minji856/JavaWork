class ThisDemo{
	int iVal;
	double dVal;
	
	//이름이 같은 경우에는 무조건 this 써줘야함
	//초기화	this,int i, double d 매개변수에는 직접 쓰면 안됨
	//iVal 지역변수 같은 지역 변수끼리 자기가 넣은거다 위에 iVal이랑 다름 -> this.iVal은 위에 iVal이랑 같다
	ThisDemo(int iVal, double dVal){
		this.iVal = iVal;
		this.dVal = dVal;
	}
		//아무것도 없는거 같지만 항상 (this) 있다 명시만 안할뿐
	void display(){
		System.out.println(this.iVal + ", " + this.dVal);
	}
}
//어디에 있는 ival에 넣으란건지 안 써있음 t3까지 3개인데
//실인자 두개 10,10.5 인데 주소값이 생략되어있음 (주소,10,10.5) t1=주소
//모든 주소는 기본적으로 현재 객체주소가 온다


public class ThisTest {
	public static void main(String[] args){
		ThisDemo t1 = new ThisDemo(10, 10.5);
		ThisDemo t2 = new ThisDemo(20, 20.5);
		ThisDemo t3 = new ThisDemo(30, 30.5);
		
		t1.display();
		t2.display();
		t3.display();
	}
}