class ConsDemo1 {
	int iVal;
	double dVal;
	
	//생성자
	ConsDemo1(int i){
		System.out.println("생성자 호출됨");
	}
	
	ConsDemo1(){};
}

public class ConsTest1 {
	public static void main(String[] args){
		new ConsDemo1(10);
		new ConsDemo1();
	}
}
