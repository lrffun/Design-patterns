package 装饰模式;
/*
 * 装饰模式：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。
 * 模式结构：
 * 		1、抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
 * 		2、具体构件（Concrete Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
 * 		3、抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 * 		4、具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 */
public class DecoratorClient {
	public static void main(String[] args) {
			//新建构件
		Component component = new ConcreteComponent();
			//第一次修饰
	    component = new ConcreteDecoratorA(component);
	      //第二次修饰
	    component = new ConcreteDecoratorB(component);
	     //修饰后运行
	    component.operation();
	}
}
