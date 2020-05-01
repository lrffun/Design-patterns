package 单例模式;

public class LazySingleton {	//懒汉式
	private LazySingleton() {}	//构造方法私有化
	private static volatile LazySingleton instance = null;	//用volatile修饰的变量，线程在每次使用变量的时候，都会读取变量修改后的最的值
	public static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		
		return instance;
	}
}
