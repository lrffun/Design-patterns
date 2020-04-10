package 工厂模式;

public class LeovonFactory extends Factory{		//联想工厂类

	@Override
	public void productComputer() {		//生产联想工厂方法
		// TODO Auto-generated method stub
		Computer computer = new LeovonComputer();
		computer.productComputer();
	}
}
