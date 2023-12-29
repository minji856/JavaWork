class EmpManager{
	String name;
	public int no;
	private double pay;
	
	void setPay(double pay) {
		this.pay = pay;
	}
	double getPay() {
		return pay;
	}
}

public class AccessModifierTest {
	public static void main(String[] args) {
		// TODO 접근 제한자 연습
		EmpManager hong = new EmpManager(); 
		
		hong.name = "홍길동";
		hong.no = 123;
		hong.setPay(1000000);
		
		System.out.println(hong.name + ", " + hong.no + ", " + hong.getPay());
	}
}
