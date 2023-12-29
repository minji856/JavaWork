public class ArrayTest3{
	public static void main (String[] args){
		int first[] = new int[4];
		int second[] = new int[4];
		int third[] = new int[4];	// 변수 12개나 만들어야됨
		//3행 4열
		int arr[][] = new int[3][4];	//100명이면 [100][4];
		//직접 초기화
		int [][]arr2 = {{1, 78, 65, 89},
						{2, 78, 65, 89},
						{3, 78, 65, 89}};
						
		System.out.println(first[0]);	// 0
		//arr2[0]번째에 가보니까 또 데이터 주소가 있는거다 한번더 거처야함 몇번째 행에 접근하느냐
		System.out.println(arr2[0][0]);  // 1
		
		//////////////불규칙 배열///////////////
		char[][] name = new char[2][6];
		
		name[0][0] = 'T';
		name[0][1] = 'O';
		name[0][2] = 'M';	// 첫번째 사람 이름 저장
		
		name[1][0] = 'M';
		name[1][1] = 'a';
		name[1][2] = 'r';
		name[1][3] = 'r';
		name[1][4] = 'y';
		
		char[][] name2 = new char[2][]; // 열의 길이가 들쑥날쑥하니까 미리결정 X
		name2[0] = new char[3]; // 첫번째 행에는 3개
		name2[1] = new char[5];
		
		// 공항 셔틀의 탑승객의 수를 저장하는 프로그램
		// (셔틀이 주중에는 10회 운행하고, 주말에는 2번 운행한다.)
		int shuttle[][] = new int [7][];
		for(int i=0; i<5; i++){
			shuttle[i] = new int[10]; // 주중 0부터 5까지면 월~금
		}
		
		shuttle[5] = new int[2];	// 주말
		shuttle[6] = new int[2];
		
		// 가짜 데이터 입력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				shuttle[i][j] = i + j + 10;
			}
		}

		for (int i = 0; i < 5; i++) {
			int sum = 0; // 각 주중마다의 탑승객 수 합계
			for (int j = 0; j < 10; j++) {
				sum += shuttle[i][j];
				}
			System.out.println("주중 탑승객 : " + sum + "명");
			}
		for (int i=5; i<7; i++){
			int sum = 0;
			for(int j=0; j<2; j++){
				shuttle[i][j] = i + j + 10;
				sum += shuttle[i][j];
				}
			System.out.println("주말 탑승객 : " + sum + "명");
			}	
		}
	}	


