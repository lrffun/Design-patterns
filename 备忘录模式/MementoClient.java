package ����¼ģʽ;
/*
 * ����¼ģʽ���ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬���Ա��Ժ���Ҫʱ�ܽ��ö���ָ���ԭ�ȱ����״̬����ģʽ�ֽп���ģʽ��
 * ģʽ�ṹ��	
 * 		1�������ˣ�Originator����ɫ����¼��ǰʱ�̵��ڲ�״̬��Ϣ���ṩ��������¼�ͻָ�����¼���ݵĹ��ܣ�ʵ������ҵ���ܣ������Է��ʱ���¼���������Ϣ��
 * 		2������¼��Memento����ɫ������洢�����˵��ڲ�״̬������Ҫ��ʱ���ṩ��Щ�ڲ�״̬�������ˡ�
 * 		3�������ߣ�Caretaker����ɫ���Ա���¼���й����ṩ�������ȡ����¼�Ĺ��ܣ����䲻�ܶԱ���¼�����ݽ��з������޸ġ�
 */
public class MementoClient {
	public static void main(String[] args) {
		Originator or = new Originator();	//����������
		Caretaker cr = new Caretaker();		//����������
		or.setState("S0");					//�����˳�ʼ״̬
		System.out.println("��ʼ״̬��"+or.getState());
		cr.setMemento(or.createMemento());	//����״̬
		or.setState("S1");					//������״̬
		System.out.println("�µ�״̬��"+or.getState());
		or.restoreMemento(cr.getMemento());	//�ָ�״̬
		System.out.println("�ָ�״̬��"+or.getState());
	}
}
