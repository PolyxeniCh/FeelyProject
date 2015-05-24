/*
 * � ����� ���� �������� ����������� ��� ������� �� ������ ��� ���������� ��� ������������� ��� �������� ��� �������.
 * 
 * ���� �� ����� �� ���������� ��������� ���� �� ������ ������� �� ��� ����������� ��� �� ������� ���,
 * ���� ��� ��� ����������� ��� ����� ��� ��������� �������� �� ���������� ��������� ���� �� ���� ���������.
 * 
 * ���� �� ��������� ��� �� ������� ��� �������� ����� ��������.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class CategoryManagement {


	private static ArrayList<Activity> activityList = new ArrayList<Activity>();           //����� ��� �������� ���� ��� �������������� ��� ����������
	private static ArrayList<Book> bookList = new ArrayList<Book>();                       //����� ��� �������� ��� �� ������ ��� ����������
	private static ArrayList<Destination> destinationList = new ArrayList<Destination>();  //����� ��� �������� ����� ���� ����������� ��� ����������
	private static ArrayList<Movie> movieList = new ArrayList<Movie>();                    //����� ��� �������� ���� ��� ������� ��� ����������
	private static ArrayList<Music> musicList = new ArrayList<Music>();                    //����� ��� �������� ��� �� ������� ��� ����������
	private static ArrayList<TvSeries> tvSeriesList = new ArrayList<TvSeries>();           //����� ��� �������� ���� ��� ����������� ������ ��� ����������

	private static final String tvSeries_MovieGenreMatrix[] = {"Action", "Fantasy", "Crime/Mystery", "Romance", "Comedy", "Drama", "Thriller"};             //������� ��� �������� ��� �� ���� ������� ��� ����������� ������
	private static final String musicGenreMatrix[] = {"Rock", "Metal", "Jazz", "Rap/Hip-hop", "Pop", "Classical", "Greek", "Soundtracks"};                  //������� ��� �������� ��� �� ���� ��������
	private static final String bookGenreMatrix[] = {"Romance", "Horror", "Crime/Mystery", "Fantasy", "Humor", "Drama", "Poetry"};                          //������� ��� �������� ��� �� ���� �������
	private static final String destinationCategoryMatrix[] = {"Food", "Drink", "Cinema", "Coffee", "Internet-cafe", "Board games", "Theater", "Concert"};  //������� ��� �������� ��� �� ���� ����������
	private static final String activityIntensityMatrix[] = {"Relaxing", "Moderate", "Intense"};                                                            //������� ��� �������� ��� �� ���� ��������������

	private static String currentMood;      //�������� ������� ��� ������


	public CategoryManagement() {
	}



	// ---------- SERIALIZATION ----------
	/*
	 * ���������� ��� ����������� ��� ���������� ��� ���������� �� ������ ser
	 * (�� ����� �� ��������� ���� ��������� ��� ����������)
	 */

	public static void serialization() {

		//���������� ������� ser ��� �������� �� ����� ��� �������������� ��� ����������
		try{
			FileOutputStream outStream = new FileOutputStream("Activities.ser");
			ObjectOutputStream out = new ObjectOutputStream(outStream);
			out.writeObject(activityList);
			out.close();
			outStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}

		//���������� ������� ser ��� �������� �� ����� ��� ������� ��� ����������
		try{
			FileOutputStream outStream = new FileOutputStream("Books.ser");
			ObjectOutputStream out = new ObjectOutputStream(outStream);
			out.writeObject(bookList);
			out.close();
			outStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}

		//���������� ������� ser ��� �������� �� ����� ��� ���������� ��� ����������
		try{
			FileOutputStream outStream = new FileOutputStream("Destinations.ser");
			ObjectOutputStream out = new ObjectOutputStream(outStream);
			out.writeObject(destinationList);
			out.close();
			outStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}

		//���������� ������� ser ��� �������� �� ����� ��� ������� ��� ����������
		try{
			FileOutputStream outStream = new FileOutputStream("Movies.ser");
			ObjectOutputStream out = new ObjectOutputStream(outStream);
			out.writeObject(movieList);
			out.close();
			outStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}

		//���������� ������� ser ��� �������� �� ����� ��� �������� ��� ����������
		try{
			FileOutputStream outStream = new FileOutputStream("Music.ser");
			ObjectOutputStream out = new ObjectOutputStream(outStream);
			out.writeObject(musicList);
			out.close();
			outStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}

		//���������� ������� ser ��� �������� �� ����� ��� ����������� ������ ��� ����������
		try{
			FileOutputStream outStream = new FileOutputStream("TvSeries.ser");
			ObjectOutputStream out = new ObjectOutputStream(outStream);
			out.writeObject(tvSeriesList);
			out.close();
			outStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}

	}

	// ------------------------------



	// ---------- DESERIALIZATION ----------
	/*
	 * �������� ��� ����������� ��� ���������� ��� ���������� ��� ������ ser
	 */
	public static void deserialization() {

		//�������� ������� ser ��� �������� �� ����� ��� �������������� ��� ����������
		try{
			FileInputStream inStream = new FileInputStream("Activities.ser");
			ObjectInputStream in = new ObjectInputStream(inStream);
			activityList = (ArrayList<Activity>) in.readObject(); 
			in.close();
			inStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}
		catch(ClassNotFoundException exc){
			exc.printStackTrace();
		}

		//�������� ������� ser ��� �������� �� ����� ��� ������� ��� ����������
		try{
			FileInputStream inStream = new FileInputStream("Books.ser");
			ObjectInputStream in = new ObjectInputStream(inStream);
			bookList = (ArrayList<Book>) in.readObject(); 
			in.close();
			inStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}
		catch(ClassNotFoundException exc){
			exc.printStackTrace();
		}

		//�������� ������� ser ��� �������� �� ����� ��� ���������� ��� ����������
		try{
			FileInputStream inStream = new FileInputStream("Destinations.ser");
			ObjectInputStream in = new ObjectInputStream(inStream);
			destinationList = (ArrayList<Destination>) in.readObject(); 
			in.close();
			inStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}
		catch(ClassNotFoundException exc){
			exc.printStackTrace();
		}

		//�������� ������� ser ��� �������� �� ����� ��� ������� ��� ����������
		try{
			FileInputStream inStream = new FileInputStream("Movies.ser");
			ObjectInputStream in = new ObjectInputStream(inStream);
			movieList = (ArrayList<Movie>) in.readObject(); 
			in.close();
			inStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}
		catch(ClassNotFoundException exc){
			exc.printStackTrace();
		}

		//�������� ������� ser ��� �������� �� ����� ��� �������� ��� ����������
		try{
			FileInputStream inStream = new FileInputStream("Music.ser");
			ObjectInputStream in = new ObjectInputStream(inStream);
			musicList = (ArrayList<Music>) in.readObject(); 
			in.close();
			inStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}
		catch(ClassNotFoundException exc){
			exc.printStackTrace();
		}

		//�������� ������� ser ��� �������� �� ����� ��� ����������� ������ ��� ����������
		try{
			FileInputStream inStream = new FileInputStream("TvSeries.ser");
			ObjectInputStream in = new ObjectInputStream(inStream);
			tvSeriesList = (ArrayList<TvSeries>) in.readObject(); 
			in.close();
			inStream.close();
		}
		catch(IOException exc){
			exc.printStackTrace();
		}
		catch(ClassNotFoundException exc){
			exc.printStackTrace();
		}

	}

	// ------------------------------



	// ---------- RECOMMENDATIONS ----------

	public static ArrayList<Activity> recommendActivity(ArrayList<String> userActivityIntensityList) {
		//���� ����� ��������� ��� �� ��� ������� �����
		return activityList;
	}

	public static ArrayList<Book> recommendBook(ArrayList<String> userBookGenreList) {
		//���� ����� ��������� ��� �� ��� ������� �����
		return bookList;
	}

	public static ArrayList<Destination> recommendDestination(ArrayList<String> userDestinationCategoryList) {
		//���� ����� ��������� ��� �� ��� ������� �����
		return destinationList;
	}

	public static ArrayList<Movie> recommendMovie(ArrayList<String> userMovieGenreList) {
		//���� ����� ��������� ��� �� ��� ������� �����
		return movieList;
	}

	public static ArrayList<Music> recommendMusic(ArrayList<String> userMusicGenreList) {
		//���� ����� ��������� ��� �� ��� ������� �����
		return musicList;
	}

	public static ArrayList<TvSeries> recommendTvSeries(ArrayList<String> userTvSeriesGenreList) {
		//���� ����� ��������� ��� �� ��� ������� �����
		return tvSeriesList;
	}

	// ------------------------------



	// ---------- ADD DATA ----------
	/*
	 * �������� ������������ ���� ���������� ��� ����������
	 */

	//�������� ���� �������������� ��� �������
	public static void addNewActivity(String title, String activityLink, String intensity, ArrayList<String> mood) {
		Activity newActivity = new Activity(title, activityLink, intensity);
		newActivity.setMood(mood);
		activityList.add(newActivity);
	}

	// �������� ���� ������� ��� �������
	public static void addNewBook(String title, String bookLink, String author, ArrayList<String> genre, ArrayList<String> mood) {
		Book newBook = new Book(title, bookLink, author);
		newBook.setGenre(genre);
		newBook.setMood(mood);
		bookList.add(newBook);
	}


	// �������� ���� ���������� ��� �������
	public static void addNewDestination(String title, String mapLink, String category, ArrayList<String> mood) {
		Destination newDestination = new Destination(title, mapLink, category);
		newDestination.setMood(mood);
		destinationList.add(newDestination);
	}

	// �������� ���� ������� ��� �������
	public static void addNewMovie(String title, String trailerLink, String IMDBLink, ArrayList<String> genre, ArrayList<String> mood) {
		Movie newMovie = new Movie(title, trailerLink, IMDBLink);
		newMovie.setGenre(genre);
		newMovie.setMood(mood);
		movieList.add(newMovie);
	}

	// �������� ���� �������� ��� �������
	public static void addNewMusic(String title, String songLink, String artist, ArrayList<String> genre, ArrayList<String> mood) {
		Music newMusic = new Music(title, songLink, artist);
		newMusic.setGenre(genre);
		newMusic.setMood(mood);
		musicList.add(newMusic);
	}

	// �������� ���� ����������� ������ ��� �������
	public static void addNewTvSeries(String title, String trailerLink, String IMDBLink, ArrayList<String> genre, ArrayList<String> mood) {
		TvSeries newTvSeries = new TvSeries(title, trailerLink, IMDBLink);
		newTvSeries.setGenre(genre);
		newTvSeries.setMood(mood);
		tvSeriesList.add(newTvSeries);
	}

	// ------------------------------



	// ---------- GETTERS ----------

	public static ArrayList<Activity> getActivityList() {
		return activityList;
	}

	public static ArrayList<Book> getBookList() {
		return bookList;
	}

	public static ArrayList<Destination> getDestinationList() {
		return destinationList;
	}

	public static ArrayList<Movie> getMovieList() {
		return movieList;
	}

	public static ArrayList<Music> getMusicList() {
		return musicList;
	}

	public static ArrayList<TvSeries> getTvSeriesList() {
		return tvSeriesList;
	}

	public static String[] getActivityintensitymatrix() {
		return activityIntensityMatrix;
	}

	public static String[] getBookgenrematrix() {
		return bookGenreMatrix;
	}

	public static String[] getDestinationcategorymatrix() {
		return destinationCategoryMatrix;
	}

	public static String[] getMusicgenrematrix() {
		return musicGenreMatrix;
	}

	public static String[] getTvseriesMoviegenrematrix() {
		return tvSeries_MovieGenreMatrix;
	}

	public static String getCurrentMood() {
		return currentMood;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public static void setActivityList(ArrayList<Activity> activityList) {
		CategoryManagement.activityList = activityList;
	}

	public static void setBookList(ArrayList<Book> bookList) {
		CategoryManagement.bookList = bookList;
	}

	public static void setDestinationList(ArrayList<Destination> destinationList) {
		CategoryManagement.destinationList = destinationList;
	}

	public static void setMovieList(ArrayList<Movie> movieList) {
		CategoryManagement.movieList = movieList;
	}

	public static void setMusicList(ArrayList<Music> musicList) {
		CategoryManagement.musicList = musicList;
	}

	public static void setTvSeriesList(ArrayList<TvSeries> tvSeriesList) {
		CategoryManagement.tvSeriesList = tvSeriesList;
	}

	public static void setCurrentMood(String currentMood) {
		CategoryManagement.currentMood = currentMood;
	}

	// ------------------------------

}
