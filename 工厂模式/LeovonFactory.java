package ����ģʽ;

public class LeovonFactory extends Factory{		//���빤����

	@Override
	public void productComputer() {		//�������빤������
		// TODO Auto-generated method stub
		Computer computer = new LeovonComputer();
		computer.productComputer();
	}
}
