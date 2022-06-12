package com.app.test;

import static utils.BooksCollectionUtils.*;
import static utils.CustomExceptionRule.*;

import static utils.BooksCollectionUtils.*;

import java.util.*;
import app.com.core.Books;
import app.com.core.UserDetails;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			HashMap<String, Books> books = SampleBooksData();
			HashMap<String, UserDetails> userData = usedData();
			HashMap<String, Integer> cart = new HashMap<>();

			boolean loginFlag = true, exit = true;
			while (exit) {

				try {
					System.out.println(
							"\n1.login\n2.Show Books\n3.Add book \n4.Show cart details\n5.Remove book\n6.Checkout\n");
					switch (sc.nextInt()) {
					case 1:
						if (loginFlag) {
							System.out.println("\nLogin Enter userid and password");
							credentialCheck(userData, sc.next(), sc.next());
							System.out.println("\nLogged in Successfully\n\n\n Welcome to Book Store");
							loginFlag = false;
						} else
							System.out.println("Already Login Start Shoppping!!!");
						break;
					case 2:
						logicCheck(loginFlag);
						displayBooks(books);
						break;
					case 3:
						logicCheck(loginFlag);
						sc.nextLine();
						System.out.println("Enter name of Book :");
						addBook(sc.nextLine(), cart, books);
						System.out.println("Book added to Your cart");
						System.out.println(cart);

						break;
					case 4:
						logicCheck(loginFlag);
						if (cart.isEmpty())
							System.out.println("Your Cart is Empty");
						else
							showCart(cart);
						break;

					case 5:
						sc.nextLine();
						logicCheck(loginFlag);
						if(cart.isEmpty())
							System.out.println("Cart is Empty ");
						else {
						System.out.println("Enter name of Book :");
						removeBook(sc.nextLine(), cart, books);
						System.out.println("Book Removed from Cart");
						}
						break;
					case 6:
						logicCheck(loginFlag);
						if(cart.isEmpty())
							System.out.println("Cart is Empty !!!! Add books to Checkout");
						else {
						showCart(cart);
						cartValue(cart, books);
						exit=false;
						}
			
						
					}

				} catch (Exception e) {
					System.out.println(" " + e.getMessage());
					//e.printStackTrace();
					System.out.println("Try Again!!!");
					//sc.nextLine();
				}
			}
		}

	}
}
