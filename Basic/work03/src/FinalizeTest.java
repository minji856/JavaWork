class Fdemo {
	int count;
	
	//�޸𸮿� ��ȣ�� �Ű��ִ°Ŵ� �˾ƺ��� ����
	Fdemo(int cnt){
		count = cnt;
	}
	
	//������� �����°� �ƴϱ� ������ ����ϳ� Ʋ���� �ȵ�
	protected void finalize(){
		System.out.println("GC ������ : " + count);
	}
}
// Fdemo a = new Fdemo(i); ��� �ص� ������ 49���� ����������
// ���� �����ϴ� �ּҰ� �����ϱ� ������
// �� �̻� �������� �ʴ�. �ּҾ��� �� ����� ������ 50������ �ν��Ͻ��� ���� ���� ������ΰ� 1����
public class FinalizeTest {
	public static void main(String[] args){
		for(int i=0; i<500000; i++){
			new Fdemo(i);
		}
	}
}