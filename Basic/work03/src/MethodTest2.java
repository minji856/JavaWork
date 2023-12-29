//���� ���� ���
/*
class MethodTest2 {
	void swap(int num1, int num2){
		int temp = num1;	//num1�� �̸� �Űܵδ� �۾�
		num1 = num2;
		num2 = temp;
	}
	
	public static void main (String[] args){
		int num1 = 10, num2 = 15;
		
		System.out.println("�� ���� ��ȯ");	//�����ϱ����� 2���� �ڸ��� �ٲ㼭 ū�Ÿ� ���������� ��������
		new MethodTest2().swap(num1, num2); //�ּҸ� �������ָ� ���� ���ϴ� ��ġ���� ���� ���Ѵ� return���� �ذ��� �� ������
		
		System.out.println("num1 " + num1 + ", num2 " + num2);
	}
}
*/
public class MethodTest2 {
	int num1 = 10, num2 = 15;	//������ �ν��Ͻ� ������ ����
	
	void swap(MethodTest2 m){	//m2.swap(m2) ���� �����´�
		int temp = m.num1;	
		m.num1 = m.num2;
		m.num2 = temp;
	}
	
	public static void main (String[] args){
		System.out.println("�� ���� ��ȯ");	
		MethodTest2 m2 = new MethodTest2(); //�ּҰ� ������ ��
		m2.swap(m2);
		
		System.out.println("num1= " + m2.num1 + ", num2= " + m2.num2);
	}
}