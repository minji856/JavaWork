class BookTest {
	public static void main(String[] args){
		/*
		BookPack.Book books[] = new BookPack.Book[4];
		books[0] = new BookPack.Book("자바를 자바라", "홍길동", 2005);
		books[1] = new BookPack.Book("CSS", "임꺽정", 2012);
		books[2] = new BookPack.Book("javascript", "신동석", 2009);
		books[3] = new BookPack.Book("Html", "강감찬", 2020);
		
		for(int i=0; i<books.length; i++){
			books[i].show();
		}
	}*/
		BookExt books[] = new BookExt[4];
		books[0] = new BookExt("자바를 자바라", "홍길동", 2005, "영진");
		books[1] = new BookExt("CSS", "임꺽정", 2012, "가예");
		books[2] = new BookExt("javascript", "신동석", 2009, "한빛");
		books[3] = new BookExt("Html", "강감찬", 2020, "에이콘");
		
		for(int i=0; i<books.length; i++){
			books[i].show();
		}
		// 자식은 쓸 수 있는데 외부에선 쓸 수 없다
		// books[0].title = "SQL";	
	}
}