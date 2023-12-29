package charstream;

import java.io.IOException;
import java.io.PrintWriter;

public class FileTest4 {

	public static void main(String[] args) throws IOException{
		// TODO PrintWriter 성능테스트
		// bufferedwriter 에는 printf가 없으니까 기증을 쓰기 위해 printwriter로 결국 묶어야한다
		// 좋은 기능 다 해뒀다. 파일 저장 기능 성능 기능 printf 기능까지 쓸 수 있는 객체인것이다. 옵션 추가느낌
		
//		PrintWriter pw = new PrintWriter(new BufferedWriter(
//			new FileWriter("C:\\maymin\\JavaWork\\EclipseWork\\sungjuk.txt")));
		
		// 기능을 다 이미 가지고있는거라서 한줄로 끝날 수 있다. 위에랑 같은 코드
		PrintWriter pw = new PrintWriter("C:\\maymin\\JavaWork\\EclipseWork\\sungjuk.txt");
		
		pw.println("***********성적표***************");
		pw.println("--------------------------------------");
		// %를 이용해서 자릿수를 정할 수 있었음
		// 5자리에 숫자 5자리에 정수형과 숫자 f는 플롯으로 캐스팅 해줘야한다 더블형 못옴
		pw.printf("%3s : %5d %5d %5.1f %n",
				"홍길동", 98, 67, (float)((98+67)/2));
		pw.printf("%3s : %5d %5d %5.1f %n",
				"임꺽정", 89, 76, (float)((89+76)/2));
		pw.printf("%3s : %5d %5d %5.1f %n",
				"신돌석", 100, 81, (float)((100+81)/2));
		pw.close();
	}

}
