package 简单工厂模式;
/*
 * 工厂方法（FactoryMethod）模式的定义：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。
 * 模式结构：
 * 		1、抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
 * 		2、具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 * 		3、抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
 * 		4、具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
 */
public class SimpleFactoryClient {
	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();	//新建一个计算机工厂
		factory.productComputer("HP").start();
		factory.productComputer("Lenovo").start();
		factory.productComputer("Aliens").start();
	}
	
}
