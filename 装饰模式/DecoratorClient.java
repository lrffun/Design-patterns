package װ��ģʽ;
/*
 * װ��ģʽ��ָ�ڲ��ı����ж���ṹ������£���̬�ظ��ö�������һЩְ�𣨼���������⹦�ܣ���ģʽ�������ڶ���ṹ��ģʽ��
 * ģʽ�ṹ��
 * 		1�����󹹼���Component����ɫ������һ������ӿ��Թ淶׼�����ո������εĶ���
 * 		2�����幹����Concrete Component����ɫ��ʵ�ֳ��󹹼���ͨ��װ�ν�ɫΪ�����һЩְ��
 * 		3������װ�Σ�Decorator����ɫ���̳г��󹹼������������幹����ʵ��������ͨ����������չ���幹���Ĺ��ܡ�
 * 		4������װ�Σ�ConcreteDecorator����ɫ��ʵ�ֳ���װ�ε���ط������������幹��������Ӹ��ӵ����Ρ�
 */
public class DecoratorClient {
	public static void main(String[] args) {
			//�½�����
		Component component = new ConcreteComponent();
			//��һ������
	    component = new ConcreteDecoratorA(component);
	      //�ڶ�������
	    component = new ConcreteDecoratorB(component);
	     //���κ�����
	    component.operation();
	}
}
