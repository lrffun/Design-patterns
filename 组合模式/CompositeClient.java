package ���ģʽ;
/*
 * ��ϣ�Composite��ģʽ�Ķ��壺��ʱ�ֽ�������-����ģʽ������һ�ֽ�������ϳ���״�Ĳ�νṹ��ģʽ��������ʾ������-���塱�Ĺ�ϵ��ʹ�û��Ե����������϶������һ�µķ����ԡ�
 * ģʽ�ṹ��
 * 		1�����󹹼���Component����ɫ��������Ҫ������Ϊ��Ҷ��������֦�������������ӿڣ���ʵ�����ǵ�Ĭ����Ϊ����͸��ʽ�����ģʽ�г��󹹼����������ʺ͹�������Ľӿڣ��ڰ�ȫʽ�����ģʽ�в��������ʺ͹�������Ľӿڣ�����������֦������ɡ�
 * 		2����Ҷ������Leaf����ɫ��������е�Ҷ�ڵ������û���ӽڵ㣬����ʵ�ֳ��󹹼���ɫ�� �����Ĺ����ӿڡ�
 * 		3����֦������Composite����ɫ��������еķ�֧�ڵ���������ӽڵ㡣��ʵ���˳��󹹼���ɫ�������Ľӿڣ�������Ҫ�����Ǵ洢�͹����Ӳ�����ͨ������ Add()��Remove()��GetChild() �ȷ�����
 */
public class CompositeClient {
	public static void main(String[] args) {
		Component c0 = new Composite();
		Component c1 = new Composite();
		Component leaf1 = new Leaf("A");
		Component leaf2 = new Leaf("B");
		Component leaf3 = new Leaf("C");
		c0.add(leaf1);
		c0.add(c1);
		c1.add(leaf2);
		c1.add(leaf3);
		c0.operation();
	}
}
