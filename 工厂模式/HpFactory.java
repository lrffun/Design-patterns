package ����ģʽ;

public class HpFactory extends Factory{		//ʵ�ʻ��չ���

	@Override
	public void productComputer() {	//��������
		// TODO Auto-generated method stub
		Computer computer = new HpComputer();
		computer.productComputer();
	}
}
