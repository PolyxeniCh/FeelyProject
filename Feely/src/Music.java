/*
 * Η κλάση αποτελεί ένα αντικείμενο τύπου : Μουσική
 */

import java.util.ArrayList;


public class Music extends Category {


	private String artist;                                          //Καλλιτέχνης του κομματιού μουσικής
	private ArrayList<String> genre = new ArrayList<String>();      //Είδη στα οποία ανήκει το κομμάτι μουσικής


	public Music(String title, String link, String artist) {
		super(title, link);
		this.artist = artist;
	}


	// ---------- GETTERS ----------

	public String getArtist() {
		return artist;
	}

	public ArrayList<String> getGenre() {
		return genre;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setGenre(ArrayList<String> genre) {
		this.genre = genre;
	}

	// ------------------------------

}
