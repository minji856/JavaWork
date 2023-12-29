package bytestream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		// TODO 임의 접근(RandomAccess)
		int data[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		
		// 읽기 쓰기 가능하게 rw 모드 적어주기
		RandomAccessFile raf =
				new RandomAccessFile("C:\\maymin\\JavaWork\\EclipseWork\\test5.txt","rw");
		
		for(int i=0; i<10; i++) {
			raf.writeInt(data[i]);
		}
		
		raf.seek(0);
		// 첫번째데이터가 출력됨
		System.out.println(raf.readInt());
		
		// L값이라서 인덱스가 아니다
		// 0부터3까지가 10이라는 값이고 각각의 시작주소.byte주소
		// 8은 결국 세번째 데이터 바이트스트림이라 연산하기가 쉽지않다
		raf.seek(8);
		System.out.println(raf.readInt());
		
		/*** 4 바이트씩이니까 3을 곱해주면 3번째 ***/
		raf.seek(4*3);
		System.out.println(raf.readInt());
	}
}
