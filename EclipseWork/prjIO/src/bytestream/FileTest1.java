package bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		// TODO 파일로부터 입력받아 콘솔로 출력
		// 경로를 안 넣으려면 class 파일과 같은 위치인 bin 폴더에 파일 만들기
		// \n 으로 하면 특수문자 공백이되니까 경로에는 \\ 두번 써준것 /는 하나만 해도 된다.
		// 운영체재에 따라서 좀 다른데 / 는 리눅스 버전 윈도우는 \\
		FileInputStream fin =
				new FileInputStream("C:\\maymin\\JavaWork\\EclipseWork\\test.txt");
		
		/* 입력받을 글자가 얼마나 될지는 모른다 키보드 입력받는것 처럼 파일을 한글자씩 끝까지
		 * 파일에서는 더 이상 읽어올 값이 없으면 -1 이라고 한다. 키보드는 컨트롤z였음 
		   더 이상 읽을게 없으면 -1을 가져온다 */
		int input = 0;
		while(input != -1) {
			input = fin.read();
			// System.out.print((char)input);
			// System.out 은 객체라서 주소를 받을 수가 있다.
			OutputStream os = System.out;
			os.write((char)input);
			os.flush();
			// 마지막에 출력된 특수문자는 크게 신경 안 써도된다. 메모리 낭비
		}
		/* 서버 운영할때 잘 안닫아주면 서버가 느려진다. 지금 당장은 문제가 없어보이지만
		 * 외부에서 입력 받거나 메모리에 올려놨을때 꼭 닫아줘야한다. */
		fin.close();
	}
}
