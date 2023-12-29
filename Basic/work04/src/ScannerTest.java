public class ScannerTest {
	public static void main (String[] args){
		java.util.Scanner scan= 
			new java.util.Scanner(System.in);
		
		System.out.print("이름 입력:");
		String name = scan.next();
		System.out.println("당신의 이름은 " + name + "이다.");
		
		System.out.print("나이 입력:");
		int age = scan.nextInt(); 	//도움말가면 다 나온다 숫자로 변환
		System.out.println("당신의 나이는 " + age + "이다.");
		
		System.out.print("점수 입력:");
		double point = scan.nextDouble(); 	//도움말가면 다 나온다 숫자로 변환
		System.out.println("당신의 점수는 " + point + "이다.");
	}
}