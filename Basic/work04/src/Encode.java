public class Encode {
	public static void main (String[] args){
		String msg = "X맨은 홍길동이다."; //객체는 분해시켜야한다 한글자로 뽑아내면 기본타입이 된다
		String key = "axdk?*!z"; // 이걸 알아야 데이터 복원가능
		String enc = "", dec=""; 
		
		int cnt = 0;
		// 메시지를 암호화한 값
		for(int i=0; i<msg.length(); i++){
			enc += (char)msg.charAt(i)^key.charAt(cnt);
			cnt ++;
			if(cnt == key.length()){
				cnt = 0;
			}
		}
		
		System.out.println("암호화된 값: " + enc);
		// 암호된 메시지를 복호화
		/* 10^100 굳이 이진수로 안 바꿔도됨
		 msg.charAt(i)^key 키가 정수형이였으면 이렇게만 적어도됨 
		 결과가 숫자이니까 문자로 다시 바꿔준다 (char)
		 enc = enc + 면 enc += 
		 끝까지 간지 알려고 카운트 변수를 사용한다
		 이 카운트 값이 key값의 길이와 같으면을 조건으로 다시 카운터를 0으로 리셋하면
		 1부터 시작한다자리가 모자르면 다시 a부터 순회*/
		// 암호된 메시지를 복호화
	}
}