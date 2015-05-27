/*
 *  � ����� �������� ��� ����������� ����� : �������������.
 */

public class Activity extends Category {


	private String intensity;                  //������ ��������������


	public Activity(String title, String link, String intensity) {
		super(title, link);
		this.intensity = intensity;
	}


	// ---------- GETTERS ----------

	public String getIntensity() {
		return intensity;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}

	// ------------------------------

}
