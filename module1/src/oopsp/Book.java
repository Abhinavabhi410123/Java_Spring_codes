package oopsp;
import java.util.ArrayList;
public class Book {
String title,author;
ArrayList<Book> books1 = new ArrayList<>();
Book(String title,String author){
	this.title = title;
	this.author = author;
}
void addE(Book books) {
	
	System.out.println("collection of books before adding");
	if(!(books1.contains(books))) {
	books1.add(books);
	System.out.println("collection of books after adding");
	for(Book book:books1)
	{
		System.out.println("title is: "+book.title+" author is :"+book.author);
	}
	}
	else
		System.out.println("book already added");
}
void removeE(Book books) {
	
	System.out.println("collection of books before removal");
	if(books1.contains(books)) {
		books1.remove(books);
		for(Book book:books1)
		{
			System.out.println("title is: "+book.title+" author is :"+book.author);
		}
	System.out.println("collection of books after removal");
	}
	else
		System.out.println("books not present added");
}
	public static void main(String[] args) {
		Book books = new Book("English","Rutherford");
		books.addE(books);
	}

}
