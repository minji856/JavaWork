package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = 
				new FileOutputStream("C:\\maymin\\JavaWork\\EclipseWork\\test3.txt");
		
		// byte 단위로 저장해야함
		// getBytes 쪼개주는 함수. 스트링 클래스인데 getBytes() 쓰는 이유가 이것 때문.
		for(int i=1; i<10; i++) {
			String str = i + "번째 줄입니다.\r\n";
			System.out.println(str);
			fout.write(str.getBytes());
		}
		fout.close();
	}

}
