package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException{
		// TODO	키보드로부터 입력받아 파일로 출력 
		/* FileOutputStream(String name, boolean append) 내용 초기화 후 추가 문법이용 
		 * FileOutputStream(String name, true append) 내용 추가
		 * 저장 할 때에는 파일이 없으면 만들어 준다. 미리 만들어줄 필요없음 출력할때에는 */
		FileOutputStream fout = 
				new FileOutputStream("C:\\maymin\\JavaWork\\EclipseWork\\test3.txt");
		
		int input = 0;
		while(true) {
			input = System.in.read();
			
			if(input == -1)
				break;
			// print 불가능
			fout.write((char)input);
			fout.flush();
		}
		////// 무조건 닫아주기 flush도 while문 밖으로 크게 상관은 없음 성능차이//////
		fout.close();
	}
}

/*
 * Java Jcopy a.txt b.txt
 * 
 * java Jcomp a.txt b.txt 두개가 같은파일인지 아닌지 비교해서 같은파일입니다,아닙니다 출력
 * */
