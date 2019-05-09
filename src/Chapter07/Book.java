package Chapter07;

public class Book {
	String title;
	String author;
	int price;
	Book() {
	}
	Book(String myTitle, String author){
		this(author);
		this.author = author;
	}
	Book (String author) {
		this.author = author;
	}
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	void printBookInfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}