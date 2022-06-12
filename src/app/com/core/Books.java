/*Shop has different categories (fiction,science,finance,yoga,meditation) of books.

2. Each Category can contain multiple books.

3. A Book 
	a Has a unique title.
	b It can have multiple authors.
	Author has name & email address.
	c Book Has a category, price, publishDate , quantity & a rating 
	(between 1-5)*/
package app.com.core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Books {
	private String title;
	private ArrayList<Authores> authores = new ArrayList<>();
	private Category category;
	private double price;
	private LocalDate pubDate;
	private int quantity;
	private double rating;

	public Books(String title, Category category, double price, LocalDate pubDate, int quantity, double rating) {
		this.title = title;
		this.category = category;
		this.price = price;
		this.pubDate = pubDate;
		this.quantity = quantity;
		this.rating = rating;
	}
	
	public Books(String title,int quantity,double price) {
		this.title=title;
		this.quantity=quantity;
		this.price=price;
		
	}
	
	

	public double getPrice() {
		return price;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Books [title=" + title + ", authores=" + authores + ", category=" + category + ", price=" + price
				+ ", pubDate=" + pubDate + ", quantity=" + quantity + ", rating=" + rating + "]";
	}

	public void addAuthore(String email, String name) {
		authores.add(new Authores(name, email));
	}

	public ArrayList<Authores> getAuthores() {
		return authores;
	}

	private class Authores {
		private String email;
		private String name;

		public Authores(String name, String email) {
			this.email = email;
			this.name = name;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name;
		}
	}

}
