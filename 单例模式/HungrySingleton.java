package ����ģʽ;
/*����ģʽ�����ģʽ����򵥵�ģʽ֮һ��ͨ������ͨ��Ĺ��캯���ǹ��еģ�
 * �ⲿ�����ͨ����new ���캯��()�������ɶ��ʵ�������ǣ�
 * �������Ĺ��캯����Ϊ˽�еģ��ⲿ����޷����øù��캯����
 * Ҳ���޷����ɶ��ʵ������ʱ����������붨��һ����̬˽��ʵ����
 * �������ṩһ����̬�Ĺ��к������ڴ������ȡ�þ�̬˽��ʵ����
 */
public class HungrySingleton {	//����ʽ
	private HungrySingleton() {};	//���캯��˽�л�
	private static HungrySingleton instance = new HungrySingleton();
	public static HungrySingleton getInstance() {
		return instance;
	}
}
