package �򵥹���ģʽ;

public class Client {
	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();	//�½�һ�����������
		factory.productComputer("HP").start();
		factory.productComputer("Lenovo").start();
		factory.productComputer("Aliens").start();
	}
	
}
