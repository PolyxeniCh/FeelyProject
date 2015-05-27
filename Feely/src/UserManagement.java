import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

//Η κλάση θα περιέχει στατικές ιδιότητες και μεθόδους!!!

public class UserManagement {


	private static ArrayList<User> userList = new  ArrayList<User>();
	private static String currentUsername;


	public  UserManagement() {
		//κατασκευαστής
	}


	public static int logInVerification(String username,String password) {

		   Boolean WrongPassword = false;
		   Boolean WrongUsername = false;
		   
		   User exist = new User(username,password);
		   
		   deserialization();
		      
		   for(User u : UserManagement.getUserList())
	        {
			   //System.out.println(u.getPassword());
	        	if(u.getUsername()==exist.getUsername() ) 
	        	{
	        		
	        		if(u.getPassword()==exist.getPassword())
	        		{
	        			//Γινεται το login
	        			currentUsername=exist.getUsername();
	        			JOptionPane.showMessageDialog(null, "You logged in as" + username);
	        		}
	        		else WrongPassword = true ;
	        			
	        	}
	        	else WrongUsername = true;
	        }
	    	  
		   if(WrongPassword) JOptionPane.showMessageDialog(null, "Wrong password!");
		   if(WrongUsername) JOptionPane.showMessageDialog(null, "Wrong username!" );
		   
		   return 0;
	}

	public static int signUpVerification(String username,String password,String repeatPassword) {
		
		   boolean Usernameflag = true;
		   boolean Passwordflag = false;
		   boolean BothFlag = true;
		   User NewUser = new User(username,password);	   
		   
		   if(username==password)
		   {
			   BothFlag = false;
			   JOptionPane.showMessageDialog(null, "You can't use your username as your password!");
			   
		   }
		   //Ελεγχος για το username
		   
		       deserialization();
		   
		        for(User u : UserManagement.getUserList())
		        {
		        	System.out.println(u.getUsername());
		        	if(u.getUsername()==NewUser.getUsername() )  Usernameflag  = false;
		        }
		    	  
		    	if(!Usernameflag)   JOptionPane.showMessageDialog(null, "This username already exists!");
		       
		   //Ελεγχος για τα password.
		    	
			   if(password == repeatPassword)   Passwordflag = true;
			   else JOptionPane.showMessageDialog(null, "Passwords don't match!");
			   
			   //Δημιουργια αντικειμενου σε περιπτωση που τα στοιχεια ειναι σωστα.
			   if(Usernameflag && Passwordflag && BothFlag) 
			   {
				   userList.add(NewUser);
				   serialization();
			   }
			    
			   return 0;
		 
	}

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

	public static void deserialization() {
		//Διάβασμα αρχείου ser που περιέχει τη λίστα των Δραστηριοτήτων του συστήματος
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

	public static void addUser(User n)
	{
		userList.add(n);
	}
}