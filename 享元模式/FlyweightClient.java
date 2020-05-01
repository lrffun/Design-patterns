package ��Ԫģʽ;
/*
 *  ��Ԫģʽ�����ù��������о���֧�ִ���ϸ���ȶ���ĸ��á���ͨ�������Ѿ����ڵĶ���������ȼ�����Ҫ�����Ķ����������������������Ŀ������Ӷ����ϵͳ��Դ��������
 *  ģʽ�ṹ�� 
 *  	1�������еľ�����Ԫ��Ļ��࣬Ϊ������Ԫ�淶��Ҫʵ�ֵĹ����ӿڣ�����Ԫ���ⲿ״̬�Բ�������ʽͨ���������롣
 *  	2��������Ԫ��Concrete Flyweight����ɫ��ʵ�ֳ�����Ԫ��ɫ�����涨�Ľӿڡ�
 *  	3������Ԫ��Unsharable Flyweight)��ɫ���ǲ����Թ�����ⲿ״̬�����Բ�������ʽע�������Ԫ����ط����С�
 *  	4����Ԫ������Flyweight Factory����ɫ�����𴴽��͹�����Ԫ��ɫ�����ͻ���������һ����Ԫ����ʱ����Ԫ�������ϵͳ���Ƿ���ڷ���Ҫ�����Ԫ��������������ṩ���ͻ�����������ڵĻ����򴴽�һ���µ���Ԫ����
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
		f1.operation(new UnsharedConcreteFlyweight("��1�ε���a"));
		f2.operation(new UnsharedConcreteFlyweight("��2�ε���a"));
		f3.operation(new UnsharedConcreteFlyweight("��3�ε���a"));
		f4.operation(new UnsharedConcreteFlyweight("��1�ε���b"));
		f5.operation(new UnsharedConcreteFlyweight("��2�ε���b"));
		f6.operation(new UnsharedConcreteFlyweight("��3�ε���b"));
	}
}
