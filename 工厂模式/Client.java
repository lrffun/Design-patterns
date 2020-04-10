package 工厂模式;

public class Client {
	public static void main(String[] args) {
	//	Factory factory = new HpFactory();
	//	factory.productComputer();
	//	Factory factory2 =new LeovonFactory();
	//	factory2.productComputer();
		Factory factory = (Factory)XMLUtil.getBean();
		factory.productComputer();
	}
}
