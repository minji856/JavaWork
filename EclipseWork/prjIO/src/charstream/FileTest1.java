package charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(
				new FileReader("C:\\maymin\\JavaWork\\EclipseWork\\test.txt"));
		
		String input = null;
		// 코드가 조금 다를 수 있다. while문 안에다 넣으면 if문으로
		while((input = br.readLine()) != null) {
			System.out.println(input);
		}
	}
	catch(FileNotFoundException err) {
		System.out.println("파일을 찾을 수 없다. : " + err);
	}
	catch(IOException err) {
		err.printStackTrace();
	}
	// br은 지역변수니까 변수선언 밖에 해주기 + finally에서도 또 ioexception이 필요하다
	finally {
		try {
		br.close();
		}
		catch(IOException err){}
		}
	}
}
