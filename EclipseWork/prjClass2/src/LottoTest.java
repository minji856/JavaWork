import java.util.Arrays;

public class LottoTest {

	public static void main(String[] args) {
		// TODO 로또추출기
		// 로또 추출기 중복되지않는 6개의 숫자
		// 우선 45개의 번호 중 1개를 무작위로 선택하고, 남은 44개의 번호에서 
		// 1개 선택하는 방식으로 총 6개의 번호를 추출한다
		System.out.println("로또 번호 추출기");
		
		int lotto [] = new int [6];
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for (int j=0; j < i; j++) {
				if(lotto[j] == lotto[i])
					j--;
			}
		}
		
		Arrays.sort(lotto); // 로또번호 오름차순으로 정렬
		System.out.println("로또번호 : " + Arrays.toString(lotto));
	}
}
