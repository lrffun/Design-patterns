package ������ģʽ;

public class Client {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder1();
		Director director = new Director(builder);
		Product product = director.construct();
		product.show();
	}
}
