/*
 * � ����� �������� ��� ����������� ����� : �������
 */

import java.util.ArrayList;


public class Music extends Category {


	private String artist;                                          //����������� ��� ��������� ��������
	private ArrayList<String> genre = new ArrayList<String>();      //���� ��� ����� ������ �� ������� ��������


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
