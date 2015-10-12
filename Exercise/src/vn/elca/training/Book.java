package vn.elca.training;

import java.util.SortedSet;
import java.util.TreeSet;

public class Book implements Comparable<Book>{
	private String m_name;
	private int m_price;
	private String m_author;
	private int m_quantity;
	private SortedSet<Book> m_bookStore = new TreeSet<Book>();
	
	public SortedSet<Book> getM_bookStore() {
		return m_bookStore;
	}

	public void setM_bookStore(SortedSet<Book> m_bookStore) {
		this.m_bookStore = m_bookStore;
	}

	public Book() {
		// constructor
	}
	
	/**
	 * @param m_name
	 * @param m_price
	 * @param m_author
	 * @param m_quantity
	 */
	public Book(String m_name, int m_price, String m_author, int m_quantity) {
		this.m_name = m_name;
		this.m_price = m_price;
		this.m_author = m_author;
		this.m_quantity = m_quantity;
	}
	
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public int getM_price() {
		return m_price;
	}
	public void setM_price(int m_price) {
		this.m_price = m_price;
	}
	public String getM_author() {
		return m_author;
	}
	public void setM_author(String m_author) {
		this.m_author = m_author;
	}
	public int getM_quantity() {
		return m_quantity;
	}
	public void setM_quantity(int m_quantity) {
		this.m_quantity = m_quantity;
	}
	
	public String toString() {
		return "[Author: "+ this.m_author + ", Book: " + this.m_name + ", Price: " + this.m_price + ", Qut: " + this.m_quantity + "]";
	}
	
	public void addBook(Book book) {
		m_bookStore.add(book);
	}
	
	public SortedSet<Book> getAllBooksOfAuthor(String author) {
		SortedSet<Book> collection = new TreeSet<Book>();
		for(Book book : m_bookStore) {
			if(book.getM_author().equals(author)) {
				collection.add(book);
			}
		}
		
		return collection;
	}
	
	public Book getTheMostExpensiveBookOf(String author) {
		SortedSet<Book> bookByAuthor = new TreeSet<Book>(getAllBooksOfAuthor(author));
		//return bookByAuthor.first();
		return bookByAuthor.last();
	}
	
	public static void main(String[] args) {
		Book b = new Book();
		Book b1 = new Book("Henrry Poter",551,"Harry",5);
		Book b2 = new Book("War and Peace",416,"Tonstoive",7);
		Book b3 = new Book("Oliver Twist",979,"Harry",3);
		Book b4 = new Book("The last leaf",421,"Harry",8);
		Book b5 = new Book("Missisipi",1254,"Harry",2);
		Book b6 = new Book("Gone a Wind",685,"Tonstoive",7);
		Book b7 = new Book("Gone a Wind",685,"Tonstoive",7);
		
		b.addBook(b1);
		b.addBook(b2);
		b.addBook(b3);
		b.addBook(b4);
		b.addBook(b5);
		b.addBook(b6);
		b.addBook(b7);
		System.out.println(b.getTheMostExpensiveBookOf("Harry")+"\n");
		
		for(Book bk : b.getM_bookStore()) {
			System.out.println(bk);
		}
	}
	

	@Override
	public int compareTo(Book book) {
		// TODO Auto-generated method stub
		//return book.getM_price() - this.m_price;
		return this.m_price - book.getM_price();
	}
}

