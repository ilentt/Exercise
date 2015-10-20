package vn.elca.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookStore {

	private Map<String, Set<Book>> m_bookStore = new HashMap<String, Set<Book>>();

	public void addBook(Book book) {
		if (!m_bookStore.containsKey(book.getM_author())) {
			m_bookStore.put(book.getM_author(), new HashSet<Book>());
		}

		m_bookStore.get(book.getM_author()).add(book);
	}

	public Set<Book> getAllBooksOfAuthor(String author) {
		return m_bookStore.get(author);
	}

	public Book getTheMostExpensiveBookOf(String author) {

		List<Book> list = new ArrayList<Book>(m_bookStore.get(author));
		Collections.sort(list, new Comparator<Book>() {

			@Override
			public int compare(Book b1, Book b2) {

				return b2.getM_price() - b1.getM_price();
			}

		});

		return list.get(0);

	}
	
	public void runApp() {
		BookStore bs = new BookStore();
		Book b1 = new Book("Henrry Poter", 551, "Harry", 5);
		Book b2 = new Book("War and Peace", 416, "Lev Tolstoy", 7);
		Book b3 = new Book("Oliver Twist", 979, "Harry", 3);
		Book b4 = new Book("The last leaf", 421, "Harry", 8);
		Book b5 = new Book("Missisipi", 1254, "Harry", 2);
		Book b6 = new Book("War and Peace", 685, "Lev Tolstoy", 7);
		Book b7 = new Book("Anna Karenina", 685, "Lev Tolstoy", 7);

		bs.addBook(b1);
		bs.addBook(b2);
		bs.addBook(b3);
		bs.addBook(b4);
		bs.addBook(b5);
		bs.addBook(b6);
		bs.addBook(b7);
		
		for (Map.Entry<String, Set<Book>> book : bs.m_bookStore.entrySet()) {
			System.out.println(book.getValue().toString());
		}
		
		System.out.println(bs.getTheMostExpensiveBookOf("Harry"));
	}

	public static void main(String[] args) {

		BookStore b = new BookStore();
		b.runApp();
	}
}

class Book {
	private String m_name;
	private int m_price;
	private String m_author;
	private int m_quantity;

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
		return "\n[Author: " + this.m_author + ", Book: " + this.m_name + ", Price: " + this.m_price + ", Qut: "
				+ this.m_quantity + "]";
	}
}
