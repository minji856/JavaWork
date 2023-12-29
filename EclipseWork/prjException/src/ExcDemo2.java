import java.io.IOException;
/*
public class ExcDemo2 {
	public static void main(String[] args) {
		System.out.println("문자를 입력해 주세요 : ");
		try{
			int input = java.lang.System.in.read();
			System.out.println("입력받은 값:" + (char)input);
		}
		catch(IOException err){
			System.out.println("입력 오류 : " + err);
		}
	}
*/
// throws는 여러개를 던질 수 있다.throws IOException, 등등 가능
public class ExcDemo2 {
	public static void main(String[] args) throws IOException{
		// TODO IOException
		System.out.println("문자를 입력해 주세요 : ");
		
		int input = java.lang.System.in.read();
		System.out.println("입력받은 값:" + (char)input);
	}
}
