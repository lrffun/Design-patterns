package 简单工厂模式;

public class Client {
	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();	//新建一个计算机工厂
		factory.productComputer("HP").start();
		factory.productComputer("Lenovo").start();
		factory.productComputer("Aliens").start();
	}
	
}
