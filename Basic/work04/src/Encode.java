public class Encode {
	public static void main (String[] args){
		String msg = "X���� ȫ�浿�̴�."; //��ü�� ���ؽ��Ѿ��Ѵ� �ѱ��ڷ� �̾Ƴ��� �⺻Ÿ���� �ȴ�
		String key = "axdk?*!z"; // �̰� �˾ƾ� ������ ��������
		String enc = "", dec=""; 
		
		int cnt = 0;
		// �޽����� ��ȣȭ�� ��
		for(int i=0; i<msg.length(); i++){
			enc += (char)msg.charAt(i)^key.charAt(cnt);
			cnt ++;
			if(cnt == key.length()){
				cnt = 0;
			}
		}
		
		System.out.println("��ȣȭ�� ��: " + enc);
		// ��ȣ�� �޽����� ��ȣȭ
		/* 10^100 ���� �������� �� �ٲ㵵��
		 msg.charAt(i)^key Ű�� �������̿����� �̷��Ը� ����� 
		 ����� �����̴ϱ� ���ڷ� �ٽ� �ٲ��ش� (char)
		 enc = enc + �� enc += 
		 ������ ���� �˷��� ī��Ʈ ������ ����Ѵ�
		 �� ī��Ʈ ���� key���� ���̿� �������� �������� �ٽ� ī���͸� 0���� �����ϸ�
		 1���� �����Ѵ��ڸ��� ���ڸ��� �ٽ� a���� ��ȸ*/
		// ��ȣ�� �޽����� ��ȣȭ
	}
}