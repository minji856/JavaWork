class ThisDemo{
	int iVal;
	double dVal;
	
	//�̸��� ���� ��쿡�� ������ this �������
	//�ʱ�ȭ	this,int i, double d �Ű��������� ���� ���� �ȵ�
	//iVal �������� ���� ���� �������� �ڱⰡ �����Ŵ� ���� iVal�̶� �ٸ� -> this.iVal�� ���� iVal�̶� ����
	ThisDemo(int iVal, double dVal){
		this.iVal = iVal;
		this.dVal = dVal;
	}
		//�ƹ��͵� ���°� ������ �׻� (this) �ִ� ��ø� ���һ�
	void display(){
		System.out.println(this.iVal + ", " + this.dVal);
	}
}
//��� �ִ� ival�� ���������� �� ������ t3���� 3���ε�
//������ �ΰ� 10,10.5 �ε� �ּҰ��� �����Ǿ����� (�ּ�,10,10.5) t1=�ּ�
//��� �ּҴ� �⺻������ ���� ��ü�ּҰ� �´�


public class ThisTest {
	public static void main(String[] args){
		ThisDemo t1 = new ThisDemo(10, 10.5);
		ThisDemo t2 = new ThisDemo(20, 20.5);
		ThisDemo t3 = new ThisDemo(30, 30.5);
		
		t1.display();
		t2.display();
		t3.display();
	}
}