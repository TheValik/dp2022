package crud;

import GPU.GPU;
import fileIO.FileIO;
import fileIO.fileIOInterface;

public class FileCrud implements Lab2CrudInterface {

	fileIOInterface fio;
	
	public FileCrud() {
		this.fio = new FileIO();
	}
	
	@Override
	public GPU readGPU() {
		
		return (GPU)fio.loadFromFile();
	}

	@Override
	public void updateGPU(GPU GPU) {
		fio.saveToFile(GPU);

	}

}
