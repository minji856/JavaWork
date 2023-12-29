class OpTest{
	public static void main(String[] args){
		////////////// &&와 &의 차이
		int a = 10, b = 7;
		
		//java.lang.System.out.println(a && b);
		java.lang.System.out.println(a>5 && b<3);
		
		java.lang.System.out.println(a>5 & b<3);
		//10과 7을 이진수로 바꿔서 1 || 1 일때 다시 십진수로 바꿔서 출력
		java.lang.System.out.println(a & b);	
		
		//java.lang.System.out.println(a<12 && ++b>5); 8
		java.lang.System.out.println(a>12 && ++b>5); //7	
		java.lang.System.out.println("b:" + b);	
		
		java.lang.System.out.println("------------------------");	
		
		////////////// 강제 형 변환 연산자
		double d1=3.5, d2=2.3; 
		
		//값을 잃어버리는것을 감안해야함
		int c = (int)d1 + (int)d2; 
		java.lang.System.out.println("c:" + c);	
		
		double d3 = c; // double d3 = (double)c; 크기는 73pg참고
		java.lang.System.out.println("d3:" + d3);	
		
		byte b1 = (byte)c;
		java.lang.System.out.println("b1:" + b1);

		b1 = 100 + 5;
		java.lang.System.out.println("b1:" + b1);

		b1 = (byte)(b1 + 5);
		java.lang.System.out.println("b1:" + b1);
		
		b1 += 5; // b1 = b1 + 5 줄여서 쓴게 += 자동캐스팅 효과도있음
		java.lang.System.out.println("b1:" + b1);
		
		//float f1 = (float)3.14; //뒤에다 F,f 붙여주기
		float f1 = 3.14f;
		java.lang.System.out.println("f1:" + f1);
		
		//f1 = f1 + 2.5; 굳이 캐스팅하지말고 복합치환연산자
		f1 += 2.5;
		java.lang.System.out.println("f1:" + f1);
		
		int i = 'a';
		java.lang.System.out.println("i:" + i);
		
		char c1 = 98;
		java.lang.System.out.println("c1:" + c1);
		
		long x = 10000000000L;
	}
}