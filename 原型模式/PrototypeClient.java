package ԭ��ģʽ;
/*
 * ԭ��ģʽ����һ���Ѿ�������ʵ����Ϊԭ�ͣ�ͨ�����Ƹ�ԭ�Ͷ���������һ����ԭ����ͬ�����Ƶ��¶��������ԭ��ʵ��ָ����Ҫ�����Ķ�������ࡣ
 * ģʽ�ṹ��
 * 		1������ԭ���ࣺ�涨�˾���ԭ�Ͷ������ʵ�ֵĽӿڡ�
 * 		2������ԭ���ࣺʵ�ֳ���ԭ����� clone() ���������ǿɱ����ƵĶ���
 * 		3�������ࣺʹ�þ���ԭ�����е� clone() �����������µĶ���
 */


public class PrototypeClient {	
	public static void main(String[] args) {
		Fruits apple = new Apple();
		Fruits apple2 = (Apple)apple.clone();
		System.out.println("��һ��ƻ����ϣֵ��"+apple.hashCode());
		System.out.println("�ڶ���ƻ����ϣֵ��"+apple2.hashCode());
	}
}
