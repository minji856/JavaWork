class Fdemo {
	int count;
	
	//메모리에 번호를 매겨주는거다 알아보기 쉽게
	Fdemo(int cnt){
		count = cnt;
	}
	
	//내맘대로 가져온게 아니기 때문에 토시하나 틀리면 안됨
	protected void finalize(){
		System.out.println("GC 가동중 : " + count);
	}
}
// Fdemo a = new Fdemo(i); 라고 해도 변수를 49만개 만들어줘야함
// 값을 저장하는 주소가 없으니까 쓰레기
// 더 이상 참조하지 않는. 주소없는 거 만들면 쓰레기 50만개의 인스턴스를 만들어도 실제 사용중인건 1개다
public class FinalizeTest {
	public static void main(String[] args){
		for(int i=0; i<500000; i++){
			new Fdemo(i);
		}
	}
}