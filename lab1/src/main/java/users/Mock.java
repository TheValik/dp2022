package users;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	
	private List<User1> userList = new ArrayList<>();
	
	
	public Mock () {		
		this.userList.add(new User1(0,"GTX 1060",250, 180.8f));
		this.userList.add(new User1(1,"RTX 2060",325, 350.5f));
		this.userList.add(new User1(2,"RTX 3060",400, 250.5f));
	}

	public List<User1> getUserList() {
		return userList;
	}

	public void setUserList(List<User1> userList) {
		this.userList = userList;
	}
	
	

}
