// 2���� �迭�� �̿��� ����ǥ
public class Sungjuk_v2 {
	public static void main (String[] args){
	String[] names = {"ȫ�浿", "�Ӳ���", "�ŵ���"};
	char[] grade = new char[3];	// ��� ��ü���� �⺻ ������Ÿ������ �ڹٿ��� ���س��⶧���� �ڵ����� ��ü����ó��
	int[][] sungjuk = {
		{1, 98, 90, 0, 0, 0},	// �й�, ����, ����, ����, ���, ���
		{2, 76, 55, 0, 0, 0},
		{3, 85, 73, 0, 0, 0}
	};
	
	// ���� ���ϱ� sungjuk[0].length : 6�� // sungjuk.length : 3�� ���� ����
	for(int i=0; i<sungjuk.length; i++){
		sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2];
	}
	// ��� ���ϱ�
	for(int i=0; i<sungjuk.length; i++){
		sungjuk[i][4] = sungjuk[i][3]/2;
	}
	// ���� ���ϱ� 90���̻� A����
	for(int i=0; i<sungjuk.length; i++){
		if(sungjuk[i][4]>=90)
			grade[i] = 'A';
		else if(sungjuk[i][4]>=80)
			grade[i] = 'B';
		else if(sungjuk[i][4]>=70)
			grade[i] = 'C';
		else if(sungjuk[i][4]>=60)
			grade[i] = 'D';
		else
			grade[i] = 'F';
	}
	// ��� ���ϱ� ����� �񱳸� �ؼ� �ݺ�,���ǹ�
	
	
	// ���
	System.out.println("***���� ���***");
	System.out.println("�й�\t����\t����\t����\t���\t����");
	System.out.println("-----------------------------------------------");
	for(int i=0; i<sungjuk.length; i++) {
		System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t" + sungjuk[i][1] + "\t"
			+ sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" +
			sungjuk[i][4] + "\t" + grade[i]);
	}
		
	// ���� �� ��� 
	for(int row=0; row<sungjuk.length-1; row++){
			for(int col=row+1; col<sungjuk.length; col++){
				if(sungjuk[row][4] > sungjuk[col][4]){
					int[] rowtemp = sungjuk[row];
					sungjuk[row] = sungjuk[col];
					sungjuk[col] = rowtemp;
					
					char cTemp = grade[row];
					grade[row] = grade[col];
					grade[col] = cTemp;
					
					String stemp = names[row];
					names[row] = names[col];
					names[col] = stemp;
				}
			}	//for(col) ����
		}// for(row) ����
		
		// ���� �� ���
		System.out.println("***���� ���***");
		System.out.println("�й�\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<sungjuk.length; i++) {
			System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t" + sungjuk[i][1] + "\t"
				+ sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" +
				sungjuk[i][4] + "\t" + grade[i]);
		}
	}
}