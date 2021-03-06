package 享元模式;
/*
 *  享元模式：运用共享技术来有劲地支持大量细粒度对象的复用。它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率
 *  模式结构： 
 *  	1、是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
 *  	2、具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
 *  	3、非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 *  	4、享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 * 
 */
public class FlyweightClient {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight f1 = factory.getFlyweight("a");
		Flyweight f2 = factory.getFlyweight("a");
		Flyweight f3 = factory.getFlyweight("a");
		Flyweight f4 = factory.getFlyweight("b");
		Flyweight f5 = factory.getFlyweight("b");
		Flyweight f6 = factory.getFlyweight("b");
		f1.operation(new UnsharedConcreteFlyweight("第1次调用a"));
		f2.operation(new UnsharedConcreteFlyweight("第2次调用a"));
		f3.operation(new UnsharedConcreteFlyweight("第3次调用a"));
		f4.operation(new UnsharedConcreteFlyweight("第1次调用b"));
		f5.operation(new UnsharedConcreteFlyweight("第2次调用b"));
		f6.operation(new UnsharedConcreteFlyweight("第3次调用b"));
	}
}
