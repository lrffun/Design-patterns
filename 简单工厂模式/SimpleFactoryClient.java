package �򵥹���ģʽ;
/*
 * ����������FactoryMethod��ģʽ�Ķ��壺����һ��������Ʒ����Ĺ����ӿڣ�����Ʒ�����ʵ�ʴ��������Ƴٵ������ӹ����൱�С������㴴����ģʽ����Ҫ��ġ�������ʹ������롱���ص㡣
 * ģʽ�ṹ��
 * 		1�����󹤳���Abstract Factory�����ṩ�˴�����Ʒ�Ľӿڣ�������ͨ�������ʾ��幤���Ĺ������� newProduct() ��������Ʒ��
 * 		2�����幤����ConcreteFactory������Ҫ��ʵ�ֳ��󹤳��еĳ��󷽷�����ɾ����Ʒ�Ĵ�����
 * 		3�������Ʒ��Product���������˲�Ʒ�Ĺ淶�������˲�Ʒ����Ҫ���Ժ͹��ܡ�
 * 		4�������Ʒ��ConcreteProduct����ʵ���˳����Ʒ��ɫ������Ľӿڣ��ɾ��幤������������ͬ���幤��֮��һһ��Ӧ��
 */
public class SimpleFactoryClient {
	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();	//�½�һ�����������
		factory.productComputer("HP").start();
		factory.productComputer("Lenovo").start();
		factory.productComputer("Aliens").start();
	}
	
}
