public class ArrayTest2 {
	public static void main (String[] args) 
						throws java.io.IOException {
		char[] data = { 'a', 'b', 'c', 'd', 'e', 'f' };
		
		System.out.print("찾고자 하는 문자 입력: ");
		char search = (char)System.in.read();
		
		//표시만 해둘 수 있게
		boolean flag = false;
		int i=0;
		for(; i<data.length; i++){
			if(search == data[i]){
				flag = true;
				break;
			} else{
				flag = false;
			}
		}
		//i는 0번째부터니까 1을 더해준다 (i+1)
		if(flag == true)
			System.out.println("찾았다." + (i+1) + "번째");
		 else
			System.out.println("못 찾았다.");
		
		// 이진 검색
	}
}