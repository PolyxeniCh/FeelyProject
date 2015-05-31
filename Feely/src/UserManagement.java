/*
 * � ����� ���� �������� ����������� ��� ������� �� ������ ��� ������� ��� �������� ��� �������.
 * 
 * ���� �� ����� ��� ������ ����������� ��� ��������� ���� ������ ��� �����
 * �� �������� � ��� �� �������� ��� �������.
 * 
 * ���� �� ��������� ��� �� ������� ��� �������� ����� ��������.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class UserManagement {


	private static ArrayList<User> userList = new  ArrayList<User>();   //����� ��� �������� ����� ���� ������� ��� ����������
	private static String currentUsername;                              //����� ��� �������� ������


	public  UserManagement() {
	}



	// ---------- LOG IN ----------
	/*
	 * ������� �� ���� ������� ����������� �� �������� ��� ���������� ��� ��������.
	 * ������� �� ��� ���������� ��� ��������� ��� ����� �������� ������������ ��� ������� ����.
	 */

	public static int logInVerification(String username, String password) {

		Boolean wrongPassword = false;
		Boolean wrongUsername = false;

		UserManagement.deserialization();

		if(username.equals("") || password.equals("")) {
			return 3;
		}
		
		for (User u : UserManagement.getUserList()) {
			if (u.getUsername().equals(username)) {
				wrongUsername = false;
				if (u.getPassword().equals(password)) {

					currentUsername = username;
					return 0;                      //������� �� Log In
				}
				else wrongPassword = true;
			}
			else wrongUsername = true;
		}

		if (wrongUsername) return 1;               //��� ������� � ����������� ���� ����� ����� �� �������� � �������
		if (wrongPassword) return 2;               //� ������� ��� ����� � ������� ��� �������� �� ��� ������ ��� �����������

		return 0;
		
	}

	// ------------------------------



	// ---------- SIGN UP ----------
	/*
	 * ������� �� ���� ������� ����������� �� ������������ ��� ���������� �� �� �������� ��� ���� �������.
	 * ������� �� ��� ���������� ��� ��������� ��� ����� �������� ������������ ��� ������� ����.
	 */

	public static int signUpVerification(String username, String password, String repeatPassword) {

		boolean usernameFlag = true;
		boolean passwordFlag = false;
		boolean bothFlag = true;
		
		UserManagement.deserialization();
		
		if(username.equals("") || password.equals("") || repeatPassword.equals("")) {
			return 4;                                   //������ ��� �� ����� ����� ����
		}
		
		//������� ��� �� password.

		if (usernameFlag) {
			if (password.equals(repeatPassword)) {
				passwordFlag = true;
				return 2;                               //�� password ��� repeatPassword ��� ����� ����
			}
		}

		if (username.equals(password)) {
			bothFlag = false;
			return 3;                                   //�� password ����� ���� �� �� username ��� ��' ���� ��������� ������� �������
		}
		
		//������� ��� �� username
		
		for (User u : UserManagement.getUserList()) {
			if (u.getUsername().equals(username)) {
				usernameFlag = false;
				return 1;                               //To username ��������������� ��� ������� ����
			}
		}

		//���������� ������������ �� ��������� ��� �� �������� ����� �����.
		
		if (usernameFlag && passwordFlag && bothFlag) {
			userList.add(new User(username, password));
			serialization();
			return 0;                      //������� �� Sign Up
		}        
		
		return 0;

	}

	// ------------------------------



	// ---------- SERIALIZATION ----------
	/*
	 * ���������� ��� ������ �� ���� ������� ��� ���������� �� ��� ������ ser
	 * (�� ����� �� �������� ���� ��������� ��� ����������)
	 */

	public static void serialization() {

		try{
			FileOutputStream outStream = new FileOutputStream("Users.ser");
			ObjectOutputStream out = new ObjectOutputStream(outStream);
			out.writeObject(userList);
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
	 * �������� ��� ������ ��� ������� ��� ���������� ��� ������ ser
	 */

	public static void deserialization() {

		try{
			FileInputStream inStream = new FileInputStream("Users.ser");
			ObjectInputStream in = new ObjectInputStream(inStream);
			userList = (ArrayList<User>) in.readObject(); 
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



	// ---------- GETTERS ----------

	public static ArrayList<User> getUserList() {
		return userList;
	}

	public static String getCurrentUsername() {
		return currentUsername;
	}

	// ------------------------------



	// ---------- SETTERS ----------

	public static void setUserList(ArrayList<User> userList) {
		UserManagement.userList = userList;
	}

	public static void setCurrentUsername(String currentUsername) {
		UserManagement.currentUsername = currentUsername;
	}

	// ------------------------------

}