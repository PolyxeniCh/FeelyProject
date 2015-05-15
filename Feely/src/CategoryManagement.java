import java.util.ArrayList;

//Η κλάση θα περιέχει στατικές ιδιότητες και μεθόδους!!!

public class CategoryManagement {


	private ArrayList<Activity> activityList = new ArrayList<Activity>();
	private ArrayList<Book> bookList = new ArrayList<Book>();
	private ArrayList<Destination> destinationList = new ArrayList<Destination>();
	private ArrayList<Movie> movieList = new ArrayList<Movie>();
	private ArrayList<Music> musicList = new ArrayList<Music>();
	private ArrayList<TvSeries> tvSeriesList = new ArrayList<TvSeries>();

	private final String tvSeries_MovieGenreMatrix[] = {"Action", "Fantasy", "Crime/Mystery", "Romance", "Comedy", "Drama", "Thriller"};
	private final String musicGenreMatrix[] = {"Rock", "Metal", "Jazz", "Rap/Hip-hop", "Pop", "Classical", "Greek", "Soundtracks"};
	private final String bookGenreMatrix[] = {"Romance", "Horror", "Crime/Mystery", "Fantasy", "Humor", "Drama", "Poetry"};
	private final String destinationCategoryMatrix[] = {"Food", "Drink", "Cinema", "Coffee", "Internet-cafe", "Board games", "Theater", "Concert"};
	private final String activityIntensityMatrix[] = {"Relaxing", "Moderate", "Intense"};

	private String currentMood;


	public CategoryManagement() {
		//κατασκευαστής
	}


	public void Serialization() {

	}

	public void Deserialization() {

	}


	// ---------- RECOMMENDATIONS ----------

	public ArrayList<Activity> recommendActivity(ArrayList<String> userActivityIntensityList) {
		//Αυτο ειναι προσωρινο για να μην υπαρχει λαθος
		return activityList;
	}

	public ArrayList<Book> recommendBook(ArrayList<String> userBookGenreList) {
		//Αυτο ειναι προσωρινο για να μην υπαρχει λαθος
		return bookList;
	}

	public ArrayList<Destination> recommendDestination(ArrayList<String> userDestinationCategoryList) {
		//Αυτο ειναι προσωρινο για να μην υπαρχει λαθος
		return destinationList;
	}

	public ArrayList<Movie> recommendMovie(ArrayList<String> userMovieGenreList) {
		//Αυτο ειναι προσωρινο για να μην υπαρχει λαθος
		return movieList;
	}

	public ArrayList<Music> recommendMusic(ArrayList<String> userMusicGenreList) {
		//Αυτο ειναι προσωρινο για να μην υπαρχει λαθος
		return musicList;
	}

	public ArrayList<TvSeries> recommendTvSeries(ArrayList<String> userTvSeriesGenreList) {
		//Αυτο ειναι προσωρινο για να μην υπαρχει λαθος
		return tvSeriesList;
	}

	// ------------------------------



	// ---------- ADD DATA ----------

	public void addNewActivity(String title, String activityLink, String intensity, ArrayList<String> mood) {

	}

	public void addNewBook(String title, String author, String bookLink, ArrayList<String> genre, ArrayList<String> mood) {

	}

	public void addNewDestination(String title, String mapLink, String category, ArrayList<String> mood) {

	}

	public void addNewMovie(String title, String trailerLink, String IMDBLink, ArrayList<String> genre, ArrayList<String> mood) {

	}

	public void addNewMusic(String title, String artist, String songLink, ArrayList<String> genre, ArrayList<String> mood) {

	}

	public void addNewTvSeries(String title, String trailerLink, String IMDBLink, ArrayList<String> genre, ArrayList<String> mood) {

	}

	// ------------------------------



	// ---------- GETTERS ----------

	public ArrayList<Activity> getActivityList() {
		return activityList;
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public ArrayList<Destination> getDestinationList() {
		return destinationList;
	}

	public ArrayList<Movie> getMovieList() {
		return movieList;
	}

	public ArrayList<Music> getMusicList() {
		return musicList;
	}

	public ArrayList<TvSeries> getTvSeriesList() {
		return tvSeriesList;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public void setActivityList(ArrayList<Activity> activityList) {
		this.activityList = activityList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public void setDestinationList(ArrayList<Destination> destinationList) {
		this.destinationList = destinationList;
	}

	public void setMovieList(ArrayList<Movie> movieList) {
		this.movieList = movieList;
	}

	public void setMusicList(ArrayList<Music> musicList) {
		this.musicList = musicList;
	}

	public void setTvSeriesList(ArrayList<TvSeries> tvSeriesList) {
		this.tvSeriesList = tvSeriesList;
	}

	// ------------------------------

}
