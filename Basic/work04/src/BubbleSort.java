public class BubbleSort {
	public static void main (String[] args){
		int data[] = { 2, 9, 10, 3, 7, 15, 5 };
		//int pass = 1;
		
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
		
		System.out.println("\n\n���� ���� ��...");
						//�ݺ�Ƚ�� temp:�ڸ� �ٲ� �� �ӽ� ����
		for(int i=0; i<data.length-1 ; i++){
			for(int j=0; j<data.length-1-i; j++){
				if( data[j] > data[j+1] ){
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
			//pass++;
		}
		// for(int j=0; j<data.length-1-i; j++) pass ���� �Ⱦ��� 1�� ���ֱ�
		// ������ ��� ���ϰ� �ϴ°� (�ǽ�) ��Ƚ���� �ٿ��� �� �ְ� ������ �ڸ��� ���� �ʿ䰡 �����ϱ� �տ� 2�� 2���� ���ϸ� ����
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
		
	}
}