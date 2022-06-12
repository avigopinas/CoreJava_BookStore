package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import app.com.core.Books;
import app.com.core.Category;
import app.com.core.UserDetails;

public class BooksCollectionUtils {

	public static HashMap<String, Books> SampleBooksData() {
		HashMap<String, Books> booksData = new HashMap<>();
		/*
		 * ArrayList<Books> bookList=new ArrayList<>();
		 * 
		 * 
		 * bookList.add(new
		 * Books("The Dust that Falls from Dreams",Category.valueOf("FICTION"), 300,
		 * LocalDate.of(2020, 01, 10), 10, 4.5)); bookList.add(new
		 * Books("The Hunger Games",Category.valueOf("FICTION"), 350, LocalDate.of(2020,
		 * 01, 10), 10, 4.3)); bookList.add(new
		 * Books("Physica",Category.valueOf("SCIENCE"), 500, LocalDate.of(2020, 01, 10),
		 * 10, 4.0)); bookList.add(new Books("Relativity",Category.valueOf("SCIENCE"),
		 * 300, LocalDate.of(2020, 01, 10), 10, 4.5)); bookList.add(new
		 * Books("The Intelligent Investor",Category.valueOf("FINANCE"), 450,
		 * LocalDate.of(2020, 01, 10), 10, 4.5)); bookList.add(new
		 * Books("One up on Wall Street",Category.valueOf("FINANCE"),650
		 * ,LocalDate.of(2020, 01, 10), 10, 4.5)); bookList.add(new
		 * Books("Roots of Yoga",Category.valueOf("YOGA"), 250, LocalDate.of(2020, 01,
		 * 10), 10, 4.5)); bookList.add(new Books("Adiyogi",Category.valueOf("YOGA"),
		 * 425, LocalDate.of(2020, 01, 10), 10, 4.5)); bookList.add(new
		 * Books("Meditation for Beginnerss",Category.valueOf("MEDIDATION"), 600,
		 * LocalDate.of(2020, 01, 10), 10, 4.5)); bookList.add(new
		 * Books("Meditation for Beginnerss",Category.valueOf("MEDIDATION"), 600,
		 * LocalDate.of(2020, 01, 10), 10, 4.5));
		 */

		booksData.putIfAbsent("The Dust that Falls from Dreams", new Books("The Dust that Falls from Dreams",
				Category.valueOf("FICTION"), 300, LocalDate.of(2020, 01, 10), 10, 4.5));
		booksData.putIfAbsent("The Hunger Games",
				new Books("The Hunger Games", Category.valueOf("FICTION"), 350, LocalDate.of(2020, 01, 10), 10, 4.3));
		booksData.putIfAbsent("Physica",
				new Books("Physica", Category.valueOf("SCIENCE"), 500, LocalDate.of(2020, 01, 10), 10, 4.0));
		booksData.putIfAbsent("Relativity",
				new Books("Relativity", Category.valueOf("SCIENCE"), 300, LocalDate.of(2020, 01, 10), 10, 4.5));
		booksData.putIfAbsent("The Intelligent Investor", new Books("The Intelligent Investor",
				Category.valueOf("FINANCE"), 450, LocalDate.of(2020, 01, 10), 10, 4.5));
		booksData.putIfAbsent("One up on Wall Street", new Books("One up on Wall Street", Category.valueOf("FINANCE"),
				650, LocalDate.of(2020, 01, 10), 10, 4.5));
		booksData.putIfAbsent("Roots of Yoga",
				new Books("Roots of Yoga", Category.valueOf("YOGA"), 250, LocalDate.of(2020, 01, 10), 10, 4.5));
		booksData.putIfAbsent("Adiyogi",
				new Books("Adiyogi", Category.valueOf("YOGA"), 425, LocalDate.of(2020, 01, 10), 10, 4.5));
		booksData.putIfAbsent("Meditation for Beginners", new Books("Meditation for Beginnerss",
				Category.valueOf("MEDIDATION"), 600, LocalDate.of(2020, 01, 10), 10, 4.5));
		booksData.putIfAbsent("The Book of Joy",
				new Books("The Book of Joy", Category.valueOf("MEDIDATION"), 600, LocalDate.of(2020, 01, 10), 10, 4.5));

		booksData.get("The Dust that Falls from Dreams").addAuthore("Louis@gmail.com", "Louis de Bernieres");
		booksData.get("The Hunger Games").addAuthore("Suzzane@gmail.com", "Suzzane Collins");
		booksData.get("Physica").addAuthore("Aristotle@gmail.com", "Aristotle");
		booksData.get("Relativity").addAuthore("Albert@gmail.com", "Albert Einstein");
		booksData.get("The Intelligent Investor").addAuthore("grahma@gmail.com", "Benjamin Graham");
		booksData.get("The Intelligent Investor").addAuthore("Jason@gmail.com", "Jason Zweig");
		booksData.get("One up on Wall Street").addAuthore("peter@gmail.com", "Peter Lynch");
		booksData.get("Roots of Yoga").addAuthore("james@gmail.com", "Sir James Mallinson");
		booksData.get("Roots of Yoga").addAuthore("mark@gmail.com", "Mark Singleton");
		booksData.get("Adiyogi").addAuthore("sadu@gmail.com", "Sadhguru");
		booksData.get("Adiyogi").addAuthore("arundhati@gmail.com", "Arundhathi Subramaniam");
		booksData.get("Meditation for Beginners").addAuthore("jack@gmail.com", "Jack Kornfield");
		booksData.get("The Book of Joy").addAuthore("Suzzane@gmail.com", "Dalai Lama");
		booksData.get("The Book of Joy").addAuthore("desmond@gmail.com", "Desmond Tutu");

		return booksData;

		// booksData.putIfAbsent("The Dust that Falls from Dreams",

	}

	public static HashMap<String, UserDetails> usedData() {
		HashMap<String, UserDetails> userList = new HashMap<String, UserDetails>();
		userList.putIfAbsent("avinash", new UserDetails("avinash", "avinash@123"));
		userList.putIfAbsent("pankhuri", new UserDetails("pankhuri", "pankhuri@123"));
		userList.putIfAbsent("mukul", new UserDetails("mukul", "mukul@123"));
		userList.putIfAbsent("anirudh", new UserDetails("anirudh", "anirudh@123"));
		userList.putIfAbsent("aviral", new UserDetails("aviral", "aviral@123"));
		userList.putIfAbsent("admin", new UserDetails("admin", "admin"));

		return userList;

	}

	public static void displayBooks(HashMap<String, Books> books) {
		System.out.println(
				"                                 ************************BOOKS  AVILABLE IN SHOP*************************\n\n");

		for (Books book : books.values()) {

			System.out.println(book);
		}

	}

	public static void showCart(HashMap<String, Integer> cart) {
		System.out.println("\n          Your Cart Content");
		for (Entry<String, Integer> entryCart : cart.entrySet()) {
			System.out.println("Book Name:" + entryCart.getKey() + "--------Qty=" + entryCart.getValue());
		}

	}

	public static void cartValue(HashMap<String, Integer> cart, HashMap<String, Books> book) {
		double sum = 0;
		for (Entry<String, Integer> entryCart : cart.entrySet()) {
			sum += book.get(entryCart.getKey()).getPrice() * entryCart.getValue();
		}
		System.out.println("Total Amount to Pay :" + sum);

	}

}
