class OpTest{
	public static void main(String[] args){
		////////////// &&�� &�� ����
		int a = 10, b = 7;
		
		//java.lang.System.out.println(a && b);
		java.lang.System.out.println(a>5 && b<3);
		
		java.lang.System.out.println(a>5 & b<3);
		//10�� 7�� �������� �ٲ㼭 1 || 1 �϶� �ٽ� �������� �ٲ㼭 ���
		java.lang.System.out.println(a & b);	
		
		//java.lang.System.out.println(a<12 && ++b>5); 8
		java.lang.System.out.println(a>12 && ++b>5); //7	
		java.lang.System.out.println("b:" + b);	
		
		java.lang.System.out.println("------------------------");	
		
		////////////// ���� �� ��ȯ ������
		double d1=3.5, d2=2.3; 
		
		//���� �Ҿ�����°��� �����ؾ���
		int c = (int)d1 + (int)d2; 
		java.lang.System.out.println("c:" + c);	
		
		double d3 = c; // double d3 = (double)c; ũ��� 73pg����
		java.lang.System.out.println("d3:" + d3);	
		
		byte b1 = (byte)c;
		java.lang.System.out.println("b1:" + b1);

		b1 = 100 + 5;
		java.lang.System.out.println("b1:" + b1);

		b1 = (byte)(b1 + 5);
		java.lang.System.out.println("b1:" + b1);
		
		b1 += 5; // b1 = b1 + 5 �ٿ��� ���� += �ڵ�ĳ���� ȿ��������
		java.lang.System.out.println("b1:" + b1);
		
		//float f1 = (float)3.14; //�ڿ��� F,f �ٿ��ֱ�
		float f1 = 3.14f;
		java.lang.System.out.println("f1:" + f1);
		
		//f1 = f1 + 2.5; ���� ĳ������������ ����ġȯ������
		f1 += 2.5;
		java.lang.System.out.println("f1:" + f1);
		
		int i = 'a';
		java.lang.System.out.println("i:" + i);
		
		char c1 = 98;
		java.lang.System.out.println("c1:" + c1);
		
		long x = 10000000000L;
	}
}