package users;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	
	private List<User> userList = new ArrayList<>();
	
	
	public Mock () {		
		this.userList.add(new User(0,"GTX 1060",250));
		this.userList.add(new User(1,"RTX 2060",325));
		this.userList.add(new User(2,"RTX 3060",400));
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	

}
