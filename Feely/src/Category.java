/*
 * Η κλάση αποτελεί γενικά μια κατηγορία.
 * Είναι υπερκλάση για τις εξής κλάσεις : Activity, Book, Destination, Movie, Music, TvSeries
 */

import java.io.Serializable;
import java.util.ArrayList;


public abstract class Category implements Serializable {


	private String title;                                            //Τίτλος αντικειμένου
	private String link;                                             //Link αντικειμένου για πληροφορίες στον ιστό
	private int views;                                               //Τα συνολικά views του αντικειμένου
	private ArrayList<String> mood = new ArrayList<String>();        //Οι διαθέσεις για τις οποίες είναι κατάλληλο το αντικείμενο


	public Category(String title, String link) {
		this.title = title;
		this.link = link;
		this.views = 0;                                              //Όταν πρωτοδημιουργείται ένα αντικείμενο δεν έχει views 
	}


	// ---------- GETTERS ----------

	public String getTitle() {
		return title;
	}

	public String getLink() {
		return link;
	}

	public int getViews() {
		return views;
	}

	public ArrayList<String> getMood() {
		return mood;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public void setMood(ArrayList<String> mood) {
		this.mood = mood;
	}

	// ------------------------------

}
