package crud;

import java.util.List;

import users.User;

public interface Lab2CrudInterface {

	public List<User> readUser();
	public void updateGPU(List<User> User);
}
