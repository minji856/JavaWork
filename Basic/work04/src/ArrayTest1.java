public class ArrayTest1 {
	public static void main (String[] args){
		int no=1, kor=78, eng=65, mat=89;
		
		//int[] first = new int[4];		
		int first[] = new int[4]; //�ּҸ� �ϳ��� �˸�� int first = new int[4] ������ �ȸ��� ������������ �ǹ��ϰڴ� -> []
		first[0] = 1;
		first[1] = 78;
		first[2] = 65;
		first[3] = 89;
		
		for(int i=0; i<4; i++){
			System.out.println(first[i]);	
		}
		
		int[] second = { 1, 78, 65 , 89 };
		
		//int[] third;
		//third = { 1, 78, 85, 89 };  ������ ������ �ʱ�ȭ �ϴ°��� �� �ȴ�!
	}
}