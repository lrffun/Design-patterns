package ����ģʽ;
/*
 * ���󹤳���AbstractFactory��ģʽ�Ķ��壺��һ��Ϊ�������ṩһ������һ����ػ��໥��������Ľӿڣ��ҷ���������ָ����Ҫ��Ʒ�ľ�������ܵõ�ͬ��Ĳ�ͬ�ȼ��Ĳ�Ʒ��ģʽ�ṹ��
 * ģʽ�ṹ��
 * 		1�����󹤳���Abstract Factory�����ṩ�˴�����Ʒ�Ľӿڣ����������������Ʒ�ķ��� newProduct()�����Դ��������ͬ�ȼ��Ĳ�Ʒ��
 * 		2�����幤����Concrete Factory������Ҫ��ʵ�ֳ��󹤳��еĶ�����󷽷�����ɾ����Ʒ�Ĵ�����
 * 		3�������Ʒ��Product���������˲�Ʒ�Ĺ淶�������˲�Ʒ����Ҫ���Ժ͹��ܣ����󹤳�ģʽ�ж�������Ʒ��
 * 		4�������Ʒ��ConcreteProduct����ʵ���˳����Ʒ��ɫ������Ľӿڣ��ɾ��幤������������ ͬ���幤��֮���Ƕ��һ�Ĺ�ϵ��
 */
public class FactoryClient {
	public static void main(String[] args) {
	//	Factory factory = new HpFactory();
	//	factory.productComputer();
	//	Factory factory2 =new LeovonFactory();
	//	factory2.productComputer();
		Factory factory = (Factory)XMLUtil.getBean();
		factory.productComputer();
	}
}
