// 1차월 배열을 이용한 성적표
public class Sungjuk_v1 {
	public static void main (String[] args){
	String[] names = {"홍길동", "임꺽정", "신돌석"};
	int[] no = {1, 2, 3};
	int[] kor = {98, 76, 85};
	int[] eng = {90, 55, 73};
	int[] tot = new int[3];		// 총점
	int[] avg = new int[3];
	char[] grade = new char[3];
	int[] rank = new int[3];
	
	// 총점 구하기
	for(int i=0; i<no.length; i++){
		tot[i] = kor[i] + eng[i];
	}
	// 평균 구하기
	for(int i=0; i<no.length; i++){
		avg[i] = tot[i]/2;
	}
	// 학점 구하기 90점이상 A학점
	for(int i=0; i<no.length; i++){
		if(avg[i]>=90)
			grade[i] = 'A';
		else if(avg[i]>=80)
			grade[i] = 'B';
		else if(avg[i]>=70)
			grade[i] = 'C';
		else if(avg[i]>=60)
			grade[i] = 'D';
		else
			grade[i] = 'F';
	}
	// 등수 구하기 큰값을 오른쪽 오른차순 총점만 바꾸면 안되고 나머지 국어 영어 데이터 다 바꿔줘야함
	
	System.out.println("***성적 결과***");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i] + "\t" + names[i] + "\t" + kor[i] + "\t"
				+ eng[i] + "\t" + tot[i] + "\t" +
				avg[i] + "\t" + grade[i]);
		}
		
	// 정렬 후 출력 버블, 삽입 아무거나 데이터가지고 있는 3개중 아무거나 그래도 학번이 기준이니까
	// col과 이웃되는거 col+1
	// for(int col=0; col<no.length-1-row; col++){
	// 선택정렬로 할꺼면 row=0 옆에 있는거부터 비교해야함 계속 마지막 위치까지 이동해야하니까 -1-i 빼기
	// if(avg[col] > avg[col+1])
	// 버블정렬이랑 선택정렬은 한끗차이다. 3가지가 짬뽕이 되있다 스트링만 따로 선언
		for(int row=0; row<no.length-1; row++){
			for(int col=row+1; col<no.length; col++){
				if(avg[row] > avg[col]){
					int itemp = no[row];
					no[row] = no[col];
					no[col] = itemp;
					
					itemp = kor[row];
					kor[row] = kor[col];
					kor[col] = itemp;
					
					itemp = eng[row];
					eng[row] = eng[col];
					eng[col] = itemp;
					
					itemp = tot[row];
					tot[row] = tot[col];
					tot[col] = itemp;
					
					itemp = avg[row];
					avg[row] = avg[col];
					avg[col] = itemp;
					
					itemp = grade[row];
					grade[row] = grade[col];
					grade[col] = (char)itemp;
					
					String stemp = names[row];
					names[row] = names[col];
					names[col] = stemp;
				}
			}	//for(col) 종료
		}// for(row) 종료
		// 출력
		System.out.println("***성적 결과***");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i] + "\t" + names[i] + "\t" + kor[i] + "\t"
				+ eng[i] + "\t" + tot[i] + "\t" +
				avg[i] + "\t" + grade[i]);
		}
	}
}