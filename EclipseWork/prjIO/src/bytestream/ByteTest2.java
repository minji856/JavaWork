package bytestream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteTest2 {
	static void StreamTest(InputStream in, OutputStream out) throws IOException{
		// 키보드가 아니라 어떤 장치이던지 받아 주려면 InputStream 사용.
		// system은 오직 키보드로만
		// 장치가 바뀌어도 코드가 바뀔일 없다.
		int input = in.read();
		
		/* -1이 아닐때까지 입력한 것들을 계속 끝까지 반복
		 키보드에서 -1 입력하는건 키를 2개를 누르는거다. -1 입력한게아님
		 컨트롤키와 z를 동시에 누르면 '-1' 로 정의 되 있다.
		 즉, -1은 컨트롤z키를 눌렀다는 뜻.
		 엔터를 치기 전 까지 입력한게 버퍼에 계속 싸인다 */
		while(input != -1) {
			out.write((char)input);
			input = in.read();
			}
		}
		
		/* write 메서드가 1바이트를 묶어서 출력하는 조립기능도 있다.
		 * print 메서드보다 훨씬 확장된 기능을 가지고있다. 한글도 입력됨 */
	public static void main(String[] args) throws IOException {
		StreamTest(System.in, System.out);
	}
}
