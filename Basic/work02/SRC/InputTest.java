class InputTest {
	public static void main(String[] args) throws java.io.IOException{
		System.out.println("���ڸ� �Է��� �ּ��� : ");
		int input = java.lang.System.in.read();
		System.out.println("�Է¹��� ��:" + (char)input);
		
		System.in.skip(2);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		input = System.in.read()-48;	//53(�ƽ�Ű�ڵ�)-4="5"�ƽ�Ű�ڵ� 
		System.out.println("�Է¹��� ��:" + input);
	}
}