public class StringTest {
	public static void main(String[] args){
		String[] names = new String[10];	//char �϶��� �Ұ�
		names[0] = "Tom";
		names[1] = "Johnson";
		names[2] = "Marry";
		
		System.out.println(names[0]);
		
		/////////////// String Ŭ���� ���� ////////////////
		
		// ���ȣ�� ��� String�� ����ó�� ����. � ����̴� �ᵵ ��
		String str = new String();
		str = "ȫ�浿";
		System.out.println(str);
		
		String str2 = new String("�Ӳ���");
		System.out.println(str2);
		
		String str3 = "������";
		System.out.println(str3);
		
		/////////////// String Ŭ���� APIs ////////////////
		
		String s1 = "java";
		//String s2 = "java";	 //���� ���ڿ��̴ϱ� ���� ��ġ�� �����Ѵ� ���� �ּҰ� ���ٰ� ���°Ŵ�
		String s2 = new String("java");  	// �ּҸ� ���ϴ°Ŵ�. �Ѵ� �ּҺ񱳴� �´µ� ��� �ٸ� �ּ�
		
		//if(s1 == s2)
		//	System.out.println("s1�� s2�� ����.");
		//else 
		//	System.out.println("s1�� s2�� �ٸ���.");
		
		if(s1.equals(s2))
			System.out.println("s1�� s2�� ����.");
		else 
			System.out.println("s1�� s2�� �ٸ���.");
		
		System.out.println("Java".equalsIgnoreCase(s2)); // ��ҹ��� ������� �� ��
		
		String s3 = "java is beautiful";
		String s4 = "java just one";
		
		System.out.println(s3.compareTo(s4));	//-1 s3.i�� s4.j�� �ٸ��� ��� ���� �ƽ�Ű�ڵ尡 �� ū��
		
		System.out.println(s3.charAt(3)); //a
		
		System.out.println(s3.indexOf("is")); //5
		System.out.println(s3.indexOf("a")); //1
		System.out.println(s3.lastIndexOf("a")); //10
		System.out.println(s3.indexOf("love")); // ���� ���ڸ� -1
		
		System.out.println(s3.substring(5, 6)); //i
		System.out.println(s3.substring(5)); //is beautiful
		
		String[] sp = s3.split(" ");
		for(String s : sp){
			System.out.println(s);
		}
		//��������
		for(int i=0; i<3; i++){
			System.out.println(sp[i]);
		}
		
		/////////////// �Һ��� ////////////////
		String s5 = "javu";
		s5 = "java"; // ��ġ�°� �ƴ϶� ���ο� ���ڿ� ��ü�� ��������°Ŵ� 100������ ������ 200������ ã�ư�
		System.out.println("s5 : " + s5);
		
		String s6 = s5.concat(" is number one");	//���ο� ���ڿ��� ���� ������� java�� ��������� X
		System.out.println(s6);
		System.out.println(s5 == s6);
		
		StringBuffer s7 = new StringBuffer("java");
		s7.append(" is number one");
		StringBuffer s8 = s7.append(" is number one");
		System.out.println(s7 == s8); // �ּҰ� ���ٰ� ���´�
	
	}	
}