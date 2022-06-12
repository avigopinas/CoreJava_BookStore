package utils;

import java.util.*;

import app.com.core.Books;
import app.com.core.UserDetails;
import custom_excep.CustomException;

public class CustomExceptionRule {
	public static void credentialCheck(HashMap<String, UserDetails> user,String id,String password) throws CustomException{
		if(!user.containsKey(id))
			throw new CustomException("Invlid User Id !!!");
		if(!user.get(id).getPassword().equals(password))
			throw new CustomException("Invalid  Password");
	}
	
	public static void addBook(String title,HashMap<String, Integer> cart,HashMap<String, Books> book) throws CustomException{
		if(!book.containsKey(title))
			throw new CustomException("Invalid Book Name!!!!");
		if(book.get(title).getQuantity()==0)
			throw new CustomException("Out of Stock");
		if(cart.containsKey(title)) {
			cart.put(title, ((int)cart.get(title))+1);
			book.get(title).setQuantity(book.get(title).getQuantity()-1);
			System.out.println("Already");
		}
		else {
		cart.putIfAbsent(title, 1);
		book.get(title).setQuantity(book.get(title).getQuantity()-1);
		}
		
		
	}
	
	public static void removeBook(String title,HashMap<String, Integer> cart,HashMap<String, Books> book) throws CustomException{
		if(!book.containsKey(title))
			throw new CustomException("Invalid Book Name!!!!");
			
		if(cart.containsKey(title)) {
			cart.put(title, cart.get(title)-1);
			book.get(title).setQuantity(book.get(title).getQuantity()+1);
			if(cart.get(title)==0)
				cart.remove(title);
		}
		else
			throw new CustomException("Book not Present in Your Cart !!!!");
		
		
	}
	
	public static void logicCheck(Boolean check) throws CustomException{
		if(check)
			throw new CustomException("First Login");
	}
}
