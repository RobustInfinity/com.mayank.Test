package items;

import java.util.ArrayList;

public class User {
	
	private String userId;
	private String password;
	
	public User() {}                                              //WHY ??
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean verifyUser(ArrayList<User> userList) {
		for (User user : userList) {
			if(this.getUserId().equals(user.getUserId()) && this.getPassword().equals(user.getPassword()))
				return true;
		}
		return false;
		}
	
	@Override
	public boolean equals(Object second){
		
		if(second instanceof User) {
			return this.getUserId().equals(((User)second).getUserId()) ? true : false ;
		}
		else
			return false;
	}
}
