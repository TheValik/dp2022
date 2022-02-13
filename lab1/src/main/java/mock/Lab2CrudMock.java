package mock;

import GPU.GPU;
import crud.Lab2CrudInterface;

public class Lab2CrudMock implements Lab2CrudInterface {

	@Override
	public GPU readGPU() {
		// TODO Auto-generated method stub
		return new GPU("Mock1",23,3.2f);
	}

	@Override
	public void updateGPU(GPU GPU) {
		// TODO Auto-generated method stub

	}

}
