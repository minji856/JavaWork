class BookTest {
	public static void main(String[] args){
		/*
		BookPack.Book books[] = new BookPack.Book[4];
		books[0] = new BookPack.Book("�ڹٸ� �ڹٶ�", "ȫ�浿", 2005);
		books[1] = new BookPack.Book("CSS", "�Ӳ���", 2012);
		books[2] = new BookPack.Book("javascript", "�ŵ���", 2009);
		books[3] = new BookPack.Book("Html", "������", 2020);
		
		for(int i=0; i<books.length; i++){
			books[i].show();
		}
	}*/
		BookExt books[] = new BookExt[4];
		books[0] = new BookExt("�ڹٸ� �ڹٶ�", "ȫ�浿", 2005, "����");
		books[1] = new BookExt("CSS", "�Ӳ���", 2012, "����");
		books[2] = new BookExt("javascript", "�ŵ���", 2009, "�Ѻ�");
		books[3] = new BookExt("Html", "������", 2020, "������");
		
		for(int i=0; i<books.length; i++){
			books[i].show();
		}
		// �ڽ��� �� �� �ִµ� �ܺο��� �� �� ����
		// books[0].title = "SQL";	
	}
}