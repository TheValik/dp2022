package fileIO;

import GPU.GPU;

public class Main {

	public static void main(String[] args) {
		GPU gpu =new GPU("Mock1",23,3.2f);
		fileIOInterface fio = new FileIO();
		fio.saveToFile(gpu);
		System.out.println((GPU)fio.loadFromFile());

	}

}
