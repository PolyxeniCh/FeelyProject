/*
 * � ����� �������� ������ ��� ���������.
 * ����� ��������� ��� ��� ���� ������� : Activity, Book, Destination, Movie, Music, TvSeries
 */

import java.io.Serializable;
import java.util.ArrayList;


public abstract class Category implements Serializable {


	private String title;                                            //������ ������������
	private String link;                                             //Link ������������ ��� ����������� ���� ����
	private int views;                                               //�� �������� views ��� ������������
	private ArrayList<String> mood = new ArrayList<String>();        //�� ��������� ��� ��� ������ ����� ��������� �� �����������


	public Category(String title, String link) {
		this.title = title;
		this.link = link;
		this.views = 0;                                              //���� ������������������ ��� ����������� ��� ���� views 
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
