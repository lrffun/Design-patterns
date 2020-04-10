package 工厂模式;

public class HpFactory extends Factory{		//实际惠普工厂

	@Override
	public void productComputer() {	//生产方法
		// TODO Auto-generated method stub
		Computer computer = new HpComputer();
		computer.productComputer();
	}
}
