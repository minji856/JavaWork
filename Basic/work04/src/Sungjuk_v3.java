// 클래스를 이용한 성적표 가독성 좋아짐
class Student{
	String name;
	int no;
	int kor;
	int eng;
	int tot;
	int avg;
	int rank;
	char grade;
	
	//생성자로 초기화 변수에 넣어야하는데 수고를 줄여줌. 매서드보단 생성자가 일을 더 잘하니까
	Student(String name, int no, int kor, int eng){
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
	};
}

public class Sungjuk_v3 {
	public static void main (String[] args){
	Student[] st = new Student[3]; 	 // 3명 new라고 다 객체생성이 아니다 생성자가 호출되야함 스택에 참조변수 3개를 만든거. 참조변수3개 만들어진것
	st[0] = new Student("홍길동", 1, 98, 90); // 주소가 들어감 객체생성
	st[1] = new Student("임꺽정", 2, 76, 55);
	st[2] = new Student("신돌석", 3, 85, 73);
	
	
	// 총점 구하기 
	for(int i=0; i<st.length; i++){
		st[i].tot = st[i].kor + st[i].eng;
	}
	// 평균 구하기
	for(int i=0; i<st.length; i++){
		st[i].avg = st[i].tot/2;
	}
	// 학점 구하기 90점이상 A학점
	for(int i=0; i<st.length; i++){
		if(st[i].avg>=90)
			st[i].grade = 'A';
		else if(st[i].avg>=80)
			st[i].grade = 'B';
		else if(st[i].avg>=70)
			st[i].grade = 'C';
		else if(st[i].avg>=60)
			st[i].grade = 'D';
		else
			st[i].grade = 'F';
	}
	// 등수 구하기 상대방과 비교를 해서 반복,조건문
	
	
	// 출력
	System.out.println("***성적 결과***");
	System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
	System.out.println("-----------------------------------------------");
	for(int i=0; i<st.length; i++) {
		System.out.println(st[i].no + "\t" + st[i].name + "\t" + st[i].kor + "\t"
			+ st[i].eng + "\t" + st[i].tot + "\t" +
			st[i].avg + "\t" + st[i].grade);
	}
		
	// 정렬 후 출력 
	for(int row=0; row<st.length-1; row++){
			for(int col=row+1; col<st.length; col++){
				if( st[row].avg> st[col].avg){
					Student temp = st[row];
					st[row] = st[col];
					st[col] = temp;
				}
			}	//for(col) 종료
		}// for(row) 종료
		
		// 정렬 후 출력
	System.out.println("***성적 결과***");
	System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
	System.out.println("-----------------------------------------------");
	for(int i=0; i<st.length; i++) {
		System.out.println(st[i].no + "\t" + st[i].name + "\t" + st[i].kor + "\t"
			+ st[i].eng + "\t" + st[i].tot + "\t" +
			st[i].avg + "\t" + st[i].grade);
		}	
	}
}