package 单例模式;

public class HungrySingleton {	//饿汉式
	private HungrySingleton() {};	//构造函数私有化
	private static HungrySingleton instance = new HungrySingleton();
	public static HungrySingleton getInstance() {
		return instance;
	}
}
