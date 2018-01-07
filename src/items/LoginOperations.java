package items;

import java.util.ArrayList;

public class LoginOperations {
	
	private LoginOperations() {}                                            //SINGLETON
	private static LoginOperations loginOperations;                                //SINGLETON
	ArrayList<User> userList = new ArrayList<>();

	public boolean searchUser(String userId, String password) {
		User login = new User();
		login.setUserId(userId);
		login.setPassword(password);
		if(userList.indexOf(login) > -1) {
			return login.verifyUser(userList) == true ? true : false;
		}
		return false;
	}
	
	public void addUser(User newUser) {
		this.userList.add(newUser);
	}
	
	public ArrayList<User> getUserList(){
		return userList;
	}
	public static LoginOperations getInstance() {                                  //SINGLETON
		//if(loginOperations == null)
		//	loginOperations = new LoginOperations();
		return loginOperations == null ? loginOperations = new LoginOperations() : loginOperations;
			
	}
}
