package oopClass.sec09;

public class Book {
	String title;
	String author;
	int price;
	public Book() {
		//this() : 생성자에서 다른 생성자 호출
		this("js","이몽룡",12000); //매개변수로 생성자를 구분
	}
	
	public Book(String t,String au,int p) {
		title=t;
		author = au;
		price = p;
	}
	public void show() {
		System.out.println("도서명 : "+title);
		System.out.println("저자명 : "+author);
		System.out.println("가격 : "+price);
		
	}
}
