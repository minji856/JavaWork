/*class ControlTest{
	public static void main(String[] args) throws java.io.IOException{
		System.out.println("�Է����ּ��� :");
		int input = java.lang.System.in.read();
		if(input == (char)System.in.read()) {
			System.out.println("����");
		} else {
			System.out.println("��Ÿ");
		}
	}
}*/
		/*
		1. �Է¹��� ���� �����̸� "����"��� ����ϰ� �׷��� ������ "��Ÿ"��� ���
		*/
		
		
		/*
		2. �Է¹��� ���� �ҹ����̸� �ҹ��ڶ�� ����ϰ� �빮���̸� �빮�ڶ�� ����ϰ�
		�����̸� ���ڶ�� ����ϰ� �� �ܿ��� ��Ÿ��� ���
		*/
		
		
		/*
		3. ������ ���ڰ��� (�����ڿ� q�� Q�� �Է��ϸ� ����)
			������ : +
			����1 : 2
			����2 : 4
			��� : 2 + 4 = 6
		*/
		
		/*
		������ ���� �ý����� ������
		1.if
		2.switch
		3.while
		4.for
		��ȣ���� : 1
		if (���ǽ�) ����;
		
		
		1. if
		2. switch
		3. while
		4. for
		��ȣ���� : 3
		while (���ǽ�) ����;

		...

		��ȣ���� : 0�� ������ ����
		*/

		/* 
		"." �Է��� �ɶ����� Ű���� �Է��� �о �Էµ� ������ ������ ���� �� ���� ����Ͻÿ�.
		*/
		
// javac -d ../bin ControlTest.java
// java -cp ../bin ControlTest		
class ControlTest {
	public static void main (String[] args) throws java.io.IOException{
		/*char choice; 
		do{
			System.out.println("Help on: ");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. for");
			System.out.println(" 4. while");
			System.out.println(" 5. do-while");
			System.out.println("Choose one: ");
			choice = (char)System.in.read();
		} while(choice <'1' |choice> '5');
		
		System.out.print("\n");
		
		switch(choice) {
			case '1':
				System.out.print("if ����...");
				break;
			case '2':
				System.out.print("switch ����...");
				break;	
			case '3':
				System.out.print("while ����...");
				break;	
			case '4':
				System.out.print("for ����...");
				break;	
			case '5':
				System.out.print("do-while ����...");
				break;	
		}*/
		char ch;
		int spaces = 0;
		System.out.println("Enter a period to stop.");
		do{
			ch = (char)System.in.read();
			if(ch == ' ')
				spaces++; //������ ���ֱ� ����
		}while(ch != '.');
		
		System.out.println("������ ����: " + spaces);
	}
}

//���� choice�� �����Ͽ� Ű���� �Է¹��� �� ��������