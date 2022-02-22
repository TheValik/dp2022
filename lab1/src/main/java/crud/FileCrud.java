package crud;

import java.util.List;

import fileIO.FileIO;
import fileIO.FileIOInterface;
import users.User;

public class FileCrud implements Lab2CrudInterface {

	FileIOInterface fio;
	
	public FileCrud() {
		this.fio = new FileIO();
	}
	
	@Override
	public List<User> readGPU() {
		
		return (List<User>)fio.loadFromFile();
	}

	@Override
	public void updateGPU(List<User> User) {
		fio.saveToFile(User);

	}

}
