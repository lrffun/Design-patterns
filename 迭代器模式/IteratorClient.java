package ������ģʽ;
/*��������Iterator��ģʽ�Ķ��壺�ṩһ��������˳����ʾۺ϶����е�һϵ�����ݣ�������¶�ۺ϶�����ڲ���ʾ��������ģʽ��һ�ֶ�����Ϊ��ģʽ
 * ģʽ�ṹ��
 * 		1������ۺϣ�Aggregate����ɫ������洢����ӡ�ɾ���ۺ϶����Լ���������������Ľӿڡ�
 * 		2������ۺϣ�ConcreteAggregate����ɫ��ʵ�ֳ���ۺ��࣬����һ�������������ʵ����
 * 		3�������������Iterator����ɫ��������ʺͱ����ۺ�Ԫ�صĽӿڣ�ͨ������ hasNext()��first()��next() �ȷ�����
 * 		4�������������Concretelterator����ɫ��ʵ�ֳ���������ӿ���������ķ�������ɶԾۺ϶���ı�������¼�����ĵ�ǰλ�á�
 * 
 */
public class IteratorClient {
	public static void main(String[] args) {
		Aggregate agg = new ConcreteAggregate();
		agg.add("HP");
		agg.add("Lenovo");
		agg.add("Ailens");
		agg.add("TCL");
		Iterator it = agg.getIterator();	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(it.next());
	}
}
