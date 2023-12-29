import java.io.File;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) {
		// TODO File 클래스
		
		/* 대상이 있어야함 */
		File f = new File("C:\\maymin\\JavaWork\\emp.dat");
		
		// 파일이 존재하면 실행해라
		// 파일크기는 byte로 알려준다 lastmodified는 숫자로 던져주니까 date로 바꿔주기
		if(f.exists()) {
			System.out.println("파일의 이름 : " + f.getName());
			System.out.println("상대 경로 : " + f.getPath());
			System.out.println("절대 경로 : " + f.getAbsolutePath());
			System.out.println("크기 : " + f.length() + "byte");
			System.out.println("마지막 수정일자 : " 
						+ new Date(f.lastModified()));
		}
		else{
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		f.delete();
	}

}
