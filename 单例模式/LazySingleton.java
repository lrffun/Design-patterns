package ����ģʽ;

public class LazySingleton {	//����ʽ
	private LazySingleton() {}	//���췽��˽�л�
	private static volatile LazySingleton instance = null;	//��volatile���εı������߳���ÿ��ʹ�ñ�����ʱ�򣬶����ȡ�����޸ĺ�����ֵ
	public static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		
		return instance;
	}
}
