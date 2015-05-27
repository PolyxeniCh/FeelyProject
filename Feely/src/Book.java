/*
 * Η κλάση αποτελεί ένα αντικείμενο τύπου : Βιβλίο
 */

import java.util.ArrayList;


public class Book extends Category {


	private String author;                                        //Συγγραφέας βιβλίου
	private ArrayList<String> genre = new ArrayList<String>();    //Είδη στα οποία ανήκει το βιβλίο


	public Book(String title, String link, String author) {
		super(title, link);
		this.author = author;
	}


	// ---------- GETTERS ----------

	public String getAuthor() {
		return author;
	}

	public ArrayList<String> getGenre() {
		return genre;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setGenre(ArrayList<String> genre) {
		this.genre = genre;
	}

	// ------------------------------

}
