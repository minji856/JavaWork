package bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryDataTest {
	public static void main(String[] args) throws IOException {
		// TODO DataInputStream, DataOutputStream
		FileOutputStream fout = 
				new FileOutputStream("C:\\maymin\\JavaWork\\EclipseWork\\test4.txt");
		
		/* 한번더 포장을 해준것. 파일에 저장을 해주는게 아니고 저장해주는 기능은 FileOutput 
		 * 필터를 씌워서 이진데이터만 뽑을 수 있게
		 * */
		DataOutputStream dout =
				new DataOutputStream(fout);
		// 일일이 byte로 쪼개지 않아도 쉽게 데이터 저장을 하게 해준다
		dout.writeChar('가');
		dout.writeInt(100);
		dout.writeDouble(3.14);
		dout.writeBoolean(true);
		
//		사람은 알 수없는 문자로 파일이 저장 되어있다. //  ?    d@	퇡?
		dout.close();
		fout.close();
		
		// 한번 쓰고 말꺼니까 직접 만들어 주면 된다. fout fint 없어도될 때
		// 주소를 저장하지 않아서 close 안해도되긴한다.
		// 인자값에 또 다른 인자값을 넣어서 마치 포장하는것 처럼 Filter 클래스 특징
		// 다시 알아 볼수 있게.
		DataInputStream din =
				new DataInputStream(
						new FileInputStream("C:\\maymin\\JavaWork\\EclipseWork\\test4.txt"));
		
		System.out.println(din.readChar());
		System.out.println(din.readInt());
		System.out.println(din.readDouble());
		System.out.println(din.readBoolean());
		
		// FileInput은 따로 주소를 저장하지 않았으니까 close는 datainput 만 해주면 된다.
		din.close();
	}
}
