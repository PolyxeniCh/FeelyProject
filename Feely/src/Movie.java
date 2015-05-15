import java.util.ArrayList;


public class Movie extends Category {


	private String IMDBLink;
	private ArrayList<String> genre = new ArrayList<String>();


	public Movie() {
		//κατασκευαστής
		super();
	}


	// ---------- GETTERS ----------

	public String getIMDBLink() {
		return IMDBLink;
	}

	public ArrayList<String> getGenre() {
		return genre;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public void setIMDBLink(String iMDBLink) {
		this.IMDBLink = iMDBLink;
	}

	public void setGenre(ArrayList<String> genre) {
		this.genre = genre;
	}

	// ------------------------------

}
