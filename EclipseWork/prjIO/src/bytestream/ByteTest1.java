package bytestream;

import java.io.IOException;

public class ByteTest1 {
	public static void main(String[] args) throws IOException{
		// byte로 저장할 수 있는 배열 만들기
		byte data [] = new byte [10];
		
		System.out.println("문자열 입력 : ");
		// 변수를 넣어주면 입력받은 값을 변수로 출력
		System.in.read(data);
		
		System.out.println("당신이 입력한 문자를 : ");

		for(int i=0; i<data.length; i++) {
			System.out.print((char)data[i]);
			// 문자열로 캐스팅 하고있어서 write 출력이 안된다. 이런거 신경쓰지말고
			// 따로 특별하게 만든 메서드가 print 일종의 wrapper
//			System.out.write((char)data[i]);
			
//			for(byte i : data){
//				if(i == 0)
//					break;
//			}
//			System.out.print((char)i);
//		 	
		}
	}
}
