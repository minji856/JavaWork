class VarTest {
	public static void main(String[] args){
		// 변수의 크기 확인
		byte b1 = 127;
		java.lang.System.out.println(b1);
		
		// 문자 저장
		char c1 = 'a';
		java.lang.System.out.println(c1);
		
		char c2 = '가';
		java.lang.System.out.println(c2);
		
		// stack
		int a = 10;
		{
			int b = 20;
			{
				int c = 30;
				java.lang.System.out.println("c:" + c);
				//java.lang.System.out.println("b:" + b);
				//java.lang.System.out.println("a:" + a);
			}
			java.lang.System.out.println("b:" + b);
		}
		java.lang.System.out.println("a:" + a);
		//java.lang.System.out.println("b:" + b);
	}
}
