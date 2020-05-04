package 单例模式;
/*单例模式是设计模式中最简单的模式之一。通常，普通类的构造函数是公有的，
 * 外部类可以通过“new 构造函数()”来生成多个实例。但是，
 * 如果将类的构造函数设为私有的，外部类就无法调用该构造函数，
 * 也就无法生成多个实例。这时该类自身必须定义一个静态私有实例，
 * 并向外提供一个静态的公有函数用于创建或获取该静态私有实例。
 */
public class HungrySingleton {	//饿汉式
	private HungrySingleton() {};	//构造函数私有化
	private static HungrySingleton instance = new HungrySingleton();
	public static HungrySingleton getInstance() {
		return instance;
	}
}
