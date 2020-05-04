package ����ģʽ;
/*���ԣ�Strategy��ģʽ�Ķ��壺��ģʽ������һϵ���㷨������ÿ���㷨��װ������ʹ���ǿ����໥�滻�����㷨�ı仯����Ӱ��ʹ���㷨�Ŀͻ�������ģʽ���ڶ�����Ϊģʽ����ͨ�����㷨���з�װ����ʹ���㷨�����κ��㷨��ʵ�ַָ������ί�ɸ���ͬ�Ķ������Щ�㷨���й���
 * ģʽ�ṹ��
 * 		1��������ԣ�Strategy���ࣺ������һ�������ӿڣ����ֲ�ͬ���㷨�Բ�ͬ�ķ�ʽʵ������ӿڣ�������ɫʹ������ӿڵ��ò�ͬ���㷨��һ��ʹ�ýӿڻ������ʵ�֡�
 * 		2��������ԣ�Concrete Strategy���ࣺʵ���˳�����Զ���Ľӿڣ��ṩ������㷨ʵ�֡�
 * 		3��������Context���ࣺ����һ������������ã����ո��ͻ��˵��á�
 * 
 */
public class StrategyClient {
	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new ConcreteStrategyA());
		context.strategyMethod();
		context.setStrategy(new ConcreteStrategyB());
		context.strategyMethod();
	}
}
