package 工厂模式;
/*
 * 抽象工厂（AbstractFactory）模式的定义：是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
 * 模式结构：
 * 		1、抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。
 * 		2、具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 * 		3、抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 * 		4、具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它 同具体工厂之间是多对一的关系。
 */
public class FactoryClient {
	public static void main(String[] args) {
	//	Factory factory = new HpFactory();
	//	factory.productComputer();
	//	Factory factory2 =new LeovonFactory();
	//	factory2.productComputer();
		Factory factory = (Factory)XMLUtil.getBean();
		factory.productComputer();
	}
}
