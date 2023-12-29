package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Employee[] emp = new Employee[3];
		new Employee(1, "홍길동", "영업", 3, 3500);
		emp[0] = new Employee (1, "홍길동", "영업", 3, 3500);
		emp[1] = new Employee (2, "임꺽정", "기술", 2, 2500);
		emp[2] = new Employee (3, "Tommy", "개발", 1, 3000);
		// 파일에 저장하는건 파일 OutputStream 지금은 object
		
		/* 객체들을 어떻게 저장을 할꺼냐
		 * 파일을 만들어주진 않지만 객체를 묶어서? 저장해준다 
		 * 한번만 쓰고 말꺼니까 그냥 new 안에 new */
		
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\maymin\\JavaWork\\emp.dat"));
		
		// 객체를 파일로 저장하는 과정
		oos.writeObject(emp[0]);
		oos.writeObject(emp[1]);
		oos.writeObject(emp[2]);
		// Fileoutput은 닫아줄 필요가 없음
		/* NotSerializableException 에러가 난다 하나를 해줘야한다. 
		 * 복잡한 데이터는 시리얼 라이즈를 해줘야한다. */
		oos.close();
		
		System.out.println("*********** 사원 정보 *************");
		// \t tap 키
		System.out.println("사변\t이름\t업무\t부서\t급여");
		System.out.println("---------------------------------------------------------");
		
		// 꺼내오는건 FileInputStream 	*ReadObject*로 읽어오기
		// 1개가 아니라 여러개니까 반복문으로 간단하게
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\maymin\\JavaWork\\emp.dat"));
		
		// 예외처리 해줘야하는데 throws classnotexception으로 대체. 원래는 try catch
		// 읽어들어온게 Object 타입 => 자식클래스로 캐스팅을 해준다.
		for(int i=0; i<3; i++) {
			Employee e =(Employee)ois.readObject();
			System.out.println(e);
		}
		ois.close();
		// 생략해도 기본값으로 toString이된다 println(e.toString())
		// 성적표 저장을 할 수 있다.
	}
}
