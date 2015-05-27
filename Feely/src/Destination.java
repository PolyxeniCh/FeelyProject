/*
 * � ����� �������� ��� ����������� ����� : ����������
 */
public class Destination  extends Category {


	private String category;              //��������� ����������


	public Destination(String title, String link, String category) {
		super(title, link);
		this.category = category;
	}


	// ---------- GETTERS ----------

	public String getCategory() {
		return category;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public void setCategory(String category) {
		this.category = category;
	}

	// ------------------------------

}
