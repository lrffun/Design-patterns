package ����ģʽ;

public class HungrySingleton {	//����ʽ
	private HungrySingleton() {};	//���캯��˽�л�
	private static HungrySingleton instance = new HungrySingleton();
	public static HungrySingleton getInstance() {
		return instance;
	}
}
