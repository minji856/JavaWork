class BookExt extends BookPack.Book {
	private String publisher;
	// 원래는 변수 더 길게 적어야함 title, author
	BookExt(String t, String a, int d, String p){
		super(t, a, d);
		publisher = p;
	}
	
	public void show(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println(publisher);
		System.out.println("************************");
	}
}