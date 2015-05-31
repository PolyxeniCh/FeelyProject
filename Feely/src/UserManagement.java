/*
 * Η κλάση αυτή περιέχει λειτουργίες που αφορούν το σύνολο των χρηστών που υπάρχουν στο σύστημα.
 * 
 * Έχει ως σκοπό τον έλεγχο εγκυρότητας των δεδομένων ενός χρήστη που θέλει
 * να εισέρθει ή και να εγγραφεί στο σύστημα.
 * 
 * Όλες οι ιδιότητες και οι μέθοδοι που διαθέτει είναι στατικές.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class UserManagement {


	private static ArrayList<User> userList = new  ArrayList<User>();   //Λίστα που περιέχει όλους τους χρήστες του συστήματος
	private static String currentUsername;                              //Όνομα του τρέχοντα χρήστη


	public  UserManagement() {
	}



	// ---------- LOG IN ----------
	/*
	 * Ελέγχει αν ένας χρήστης επιτρέπεται να εισέλθει στο λογαριασμό που επιθυμεί.
	 * Ανάλογα με την εγκυρότητα των στοιχείων που έχουν εισαχθεί επιστρέφεται μια ακέραια τιμή.
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
					return 0;                      //Γίνεται το Log In
				}
				else wrongPassword = true;
			}
			else wrongUsername = true;
		}

		if (wrongUsername) return 1;               //Δεν υπάρχει ο λογαριασμός στον οποίο θέλει να συνδεθεί ο χρήστης
		if (wrongPassword) return 2;               //Ο κωδικός που έβαλε ο χρήστης δεν συμφωνεί με τον κωδικό του λογαριασμού

		return 0;
		
	}

	// ------------------------------



	// ---------- SIGN UP ----------
	/*
	 * Ελέγχει αν ένας χρήστης επιτρέπεται να δημιουργήσει νέο λογαριασμό με τα στοιχεία που έχει εισάγει.
	 * Ανάλογα με την εγκυρότητα των στοιχείων που έχουν εισαχθεί επιστρέφεται μια ακέραια τιμή.
	 */

	public static int signUpVerification(String username, String password, String repeatPassword) {

		boolean usernameFlag = true;
		boolean passwordFlag = false;
		boolean bothFlag = true;
		
		UserManagement.deserialization();
		
		if(username.equals("") || password.equals("") || repeatPassword.equals("")) {
			return 4;                                   //Κάποιο από τα πεδία είναι κενό
		}
		
		//Έλεγχος για τα password.

		if (usernameFlag) {
			if (password.equals(repeatPassword)) {
				passwordFlag = true;
				return 2;                               //Τα password και repeatPassword δεν είναι ίδια
			}
		}

		if (username.equals(password)) {
			bothFlag = false;
			return 3;                                   //Το password είναι ίδιο με το username και γι' αυτό θεωρείται εύκολος κωδικός
		}
		
		//Έλεγχος για το username
		
		for (User u : UserManagement.getUserList()) {
			if (u.getUsername().equals(username)) {
				usernameFlag = false;
				return 1;                               //To username χρησιμοποιείται από κάποιον άλλο
			}
		}

		//Δημιουργία αντικειμένου σε περίπτωση που τα στοιχεία ειναι σωστά.
		
		if (usernameFlag && passwordFlag && bothFlag) {
			userList.add(new User(username, password));
			serialization();
			return 0;                      //Γίνεται το Sign Up
		}        
		
		return 0;

	}

	// ------------------------------



	// ---------- SERIALIZATION ----------
	/*
	 * Αποθήκευση της λίστας με τους χρήστες του συστήματος σε ένα αρχείο ser
	 * (το οποίο θα αποτελεί βάση δεδομένων του συστήματος)
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
	 * Διάβασμα της λίστας των χρηστών του συστήματος από αρχείο ser
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