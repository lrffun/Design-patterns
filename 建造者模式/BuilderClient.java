package 建造者模式;
/*
 * 建造者（Builder）模式的定义：指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。它是将一个复杂的对象分解为多个简单的对象，然后一步一步构建而成。它将变与不变相分离，即产品的组成部分是不变的，但每一部分是可以灵活选择的。
 * 模式结构：
 * 		1、产品角色（Product）：它是包含多个组成部件的复杂对象，由具体建造者来创建其各个滅部件。
 * 		2、抽象建造者（Builder）：它是一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法 getResult()。
 * 		3、具体建造者(Concrete Builder）：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
 * 		4、指挥者（Director）：它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息。
 */
public class BuilderClient {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder1();
		Director director = new Director(builder);
		Product product = director.construct();
		product.show();
	}
}
