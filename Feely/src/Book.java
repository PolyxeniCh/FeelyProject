/*
 * � ����� �������� ��� ����������� ����� : ������
 */

import java.util.ArrayList;


public class Book extends Category {


	private String author;                                        //���������� �������
	private ArrayList<String> genre = new ArrayList<String>();    //���� ��� ����� ������ �� ������


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
