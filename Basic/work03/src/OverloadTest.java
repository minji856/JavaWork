public class OverloadTest {
	void display(){
		System.out.println("기본 출력 내용");
	}
	
	void display(int i){
		System.out.println("i=" + i);
	}
	
	void display(double i){
		System.out.println("i=" + i);
	}
	
	void display(double i,int j){
		System.out.println("i=" + i + ", j=" + j);
	}
	
	public static void main (String[] args){
		OverloadTest test = new OverloadTest();
		
		test.display(100);
		test.display();
		test.display(3.14, 200);
		test.display(100.0);
	}
}