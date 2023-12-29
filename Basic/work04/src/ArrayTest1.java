public class ArrayTest1 {
	public static void main (String[] args){
		int no=1, kor=78, eng=65, mat=89;
		
		//int[] first = new int[4];		
		int first[] = new int[4]; //주소를 하나만 알면됨 int first = new int[4] 갯수가 안맞음 여러개공간을 의미하겠다 -> []
		first[0] = 1;
		first[1] = 78;
		first[2] = 65;
		first[3] = 89;
		
		for(int i=0; i<4; i++){
			System.out.println(first[i]);	
		}
		
		int[] second = { 1, 78, 65 , 89 };
		
		//int[] third;
		//third = { 1, 78, 85, 89 };  선언한 다음에 초기화 하는것은 안 된다!
	}
}