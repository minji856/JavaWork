package charstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
public class CharTest2 {
	static void StreamTest(InputStream in) throws IOException{
		/* in이라는 바이트 스트림을 isr로 바꿔주기만 하면됨
		 * 이 한번의 변화만으로 한글도 가능해짐 
		 
		InputStreamReader isr = new InputStreamReader(in);
		
		int input = isr.read();
		
		while(input != -1) {
			System.out.print((char)input);
			input = isr.read();
			}
		}
	
	// 문자스트림은 byte를 좀더 편하게 만드려는
	public static void main(String[] args) throws IOException {
		StreamTest(System.in);
	}
}
*/

// 성능 개선된 문자 스트림 방식
public class CharTest2 {
	static void StreamTest(InputStream in) throws IOException{
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		// 한줄씩 읽어올수 있고. return 값 string
		String input = br.readLine();
		
		// 더 이상 읽어올 수 없는 마지막 끝줄은 null 이다. -1은 한글자씩 읽어왔을때
		// null은 가리키는 객체가 없다. (char) 도 빼주기
		while(input != null) {
			System.out.print(input);
			input = br.readLine();
			}
		isr.close();
		br.close();
		}
	
	public static void main(String[] args) throws IOException {
		StreamTest(System.in);
	}
}