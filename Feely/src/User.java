/*
 * Η κλάση αποτελεί ένα αντικείμενο τύπου : Χρήστης
 */

import java.io.Serializable;
import java.util.ArrayList;


public class User  implements Serializable {


	private String username;                                                        //Όνομα χρήστη
	private String password;                                                        //Κωδικός χρήστη
	private ArrayList<String> activityIntensityList = new ArrayList<String>();      //Λίστα με τα είδη Δραστηριοτήτων που προτιμάει ο χρήστης
	private ArrayList<String> bookGenreList = new ArrayList<String>();              //Λίστα με τα είδη Βιβλίων που προτιμάει ο χρήστης
	private ArrayList<String> destinationCategoryList = new ArrayList<String>();    //Λίστα με τα είδη Προορισμών που προτιμάει ο χρήστης
	private ArrayList<String> movieGenreList = new ArrayList<String>();             //Λίστα με τα είδη Ταινιών που προτιμάει ο χρήστης
	private ArrayList<String> musicGenreList = new ArrayList<String>();             //Λίστα με τα είδη Μουσικής που προτιμάει ο χρήστης
	private ArrayList<String> tvSeriesGenreList = new ArrayList<String>();          //Λίστα με τα είδη Τηλεοπτικών Σειρών που προτιμάει ο χρήστης


	public User(String username,String password)
	{
		this.username = username;
		this.password=password;
		
	}


	// ---------- GETTERS ----------

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public ArrayList<String> getActivityIntensityList() {
		return activityIntensityList;
	}

	public ArrayList<String> getBookGenreList() {
		return bookGenreList;
	}

	public ArrayList<String> getDestinationCategoryList() {
		return destinationCategoryList;
	}

	public ArrayList<String> getMovieGenreList() {
		return movieGenreList;
	}

	public ArrayList<String> getMusicGenreList() {
		return musicGenreList;
	}

	public ArrayList<String> getTvSeriesGenreList() {
		return tvSeriesGenreList;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setActivityIntensityList(ArrayList<String> activityIntensityList) {
		this.activityIntensityList = activityIntensityList;
	}

	public void setBookGenreList(ArrayList<String> bookGenreList) {
		this.bookGenreList = bookGenreList;
	}

	public void setDestinationCategoryList(ArrayList<String> destinationCategoryList) {
		this.destinationCategoryList = destinationCategoryList;
	}

	public void setMovieGenreList(ArrayList<String> movieGenreList) {
		this.movieGenreList = movieGenreList;
	}

	public void setMusicGenreList(ArrayList<String> musicGenreList) {
		this.musicGenreList = musicGenreList;
	}

	public void setTvSeriesGenreList(ArrayList<String> tvSeriesGenreList) {
		this.tvSeriesGenreList = tvSeriesGenreList;
	}

	// ------------------------------

}
