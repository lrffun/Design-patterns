package 桥接模式;
/*
 * 桥接模式：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 * 模式结构：
 * 		1、抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。		
 * 		2、扩展抽象化（Refined    Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 * 		3、实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
 * 		4、具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 */
public class BredgeClient {
	public static void main(String[] args) {
		Implementor im = new ConcreteImplementorA();
		Implementor im2 = new ConcreteImplementorB();
		Abstraction abs = new RefinedAbstractionA(im);
		Abstraction abs2 = new RefinedAbstractionB(im2);
		abs.Operation();
		abs2.Operation();
	}
}
