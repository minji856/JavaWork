package charstream;

import java.io.IOException;
import java.io.PrintWriter;

public class FileTest3 {
	public static void main(String[] args) throws IOException {
		// TODO PrintWriter 예제
//		FileWriter fout = 
//				new FileWriter("C:\\maymin\\JavaWork\\EclipseWork\\test3.txt");
		/* 바로 파일에 저장할 수 능력을 가지고 있다
		 * 콘솔창에 안 뜨고 직접 파일탐색기에서 확인
		 * FileWriter 보다 버퍼를 많이 쓰기 때문에 성능이 뛰어나다. */
		PrintWriter fout = 
				new PrintWriter("C:\\maymin\\JavaWork\\EclipseWork\\test3.txt");
		
		for(int i=1; i<10; i++) {
			String data = i + "번째 줄입니다.\r\n";
			fout.println(data);
//			fout.write(data);
		}
		
		fout.close();
	}
}
