import java.util.ArrayList;

//� ����� �� �������� �������� ��������� ��� ��������!!!

public class UserManagement {


	private ArrayList<User> userList = new  ArrayList<User>();
	private String currentUsername;


	public UserManagement() {
		//�������������
	}


	public int logInVerification(String username,String password) {
		return 0; //���������
	}

	public int signUpVerification(String username,String password,String repeatPassword) {
		return 0; //���������
	}

	public void Serialization() {

	}

	public void Deserialization() {

	}


	// ---------- GETTERS ----------

	public ArrayList<User> getUserList() {
		return userList;
	}

	public String getCurrentUsername() {
		return currentUsername;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public void setCurrentUsername(String currentUsername) {
		this.currentUsername = currentUsername;
	}

	// ------------------------------

}