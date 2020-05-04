package ������ģʽ;
/*
 * ��������Chain of Responsibility��ģʽ�Ķ��壺Ϊ�˱����������������������������һ�𣬽���������Ĵ�����ͨ��ǰһ�����ס����һ����������ö�����һ����������������ʱ���ɽ������������������ݣ�ֱ���ж�������Ϊֹ��
 * ģʽ�ṹ��
 * 		1���������ߣ�Handler����ɫ������һ����������Ľӿڣ���������������һ��������ӡ�
 * 		2�����崦���ߣ�Concrete Handler����ɫ��ʵ�ֳ������ߵĴ��������ж��ܷ���������������Դ��������������򽫸�����ת�����ĺ���ߡ�
 * 		3���ͻ��ࣨClient����ɫ��������������������ͷ�ľ��崦���߶����ύ�����������Ĵ���ϸ�ں�����Ĵ��ݹ��̡�
 */
public class ChainOfResponsibilityClient {
	public static void main(String[] args) {
		//��װ������
		Handler handlerA = new ConcreteHandlerA();
		Handler handlerB = new ConcreteHandlerB();
		Handler handlerC = new ConcreteHandlerC();
		handlerA.setNext(handlerB);
		handlerB.setNext(handlerC);
		
		//��������
		handlerA.handlerRequest("A");
		handlerA.handlerRequest("B");
		handlerA.handlerRequest("C");
		handlerA.handlerRequest("D");
	}
}
