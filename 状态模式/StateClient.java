package ״̬ģʽ;
/*״̬��State��ģʽ�Ķ��壺����״̬�Ķ��󣬰Ѹ��ӵġ��ж��߼�����ȡ����ͬ��״̬�����У�����״̬���������ڲ�״̬�����ı�ʱ�ı�����Ϊ��
 * ģʽ�ṹ��
 * 		1��������Context����ɫ��Ҳ��Ϊ�����ģ��������˿ͻ�����Ȥ�Ľӿڣ�ά��һ����ǰ״̬��������״̬��صĲ���ί�и���ǰ״̬����������
 * 		2������״̬��State����ɫ������һ���ӿڣ����Է�װ���������е��ض�״̬����Ӧ����Ϊ��
 * 		3������״̬��Concrete    State����ɫ��ʵ�ֳ���״̬����Ӧ����Ϊ��
 * 
 */
public class StateClient {
	public static void main(String[] args) {
		Context context = new Context();
		context.Handle();
		context.Handle();
		context.Handle();
		context.Handle();
		context.Handle();
	}
}
