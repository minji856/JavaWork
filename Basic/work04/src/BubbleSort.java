public class BubbleSort {
	public static void main (String[] args){
		int data[] = { 2, 9, 10, 3, 7, 15, 5 };
		//int pass = 1;
		
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
		
		System.out.println("\n\n버블 정렬 후...");
						//반복횟수 temp:자리 바꿀 때 임시 저장
		for(int i=0; i<data.length-1 ; i++){
			for(int j=0; j<data.length-1-i; j++){
				if( data[j] > data[j+1] ){
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
			//pass++;
		}
		// for(int j=0; j<data.length-1-i; j++) pass 변수 안쓸때 1씩 빼주기
		// 마지막 계산 안하게 하는거 (실습) 비교횟수를 줄여줄 수 있게 마지막 자리는 비교할 필요가 없으니까 앞에 2개 2개만 비교하면 끝남
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
		
	}
}