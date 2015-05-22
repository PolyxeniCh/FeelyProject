import java.util.ArrayList;

//Αποτελεί υπερκλάση

public abstract class Category {


	private String title;
	private String link;
	private int views;
	private ArrayList<String> mood = new ArrayList<String>();


	public Category(String title, String link) {
		this.title = title;
		this.link = link;
		this.views = 0;
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
