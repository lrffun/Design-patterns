package �н���ģʽ;
/*
 * �н��ߣ�Mediator��ģʽ�Ķ��壺����һ���н��������װһϵ�ж���֮��Ľ�����ʹԭ�ж���֮��������ɢ���ҿ��Զ����ظı�����֮��Ľ������н���ģʽ�ֽе�ͣģʽ�����ǵ����ط���ĵ���Ӧ�á�
 * ģʽ�ṹ��
 * 		1�������н��ߣ�Mediator����ɫ�������н��ߵĽӿڣ��ṩ��ͬ�¶���ע����ת��ͬ�¶�����Ϣ�ĳ��󷽷���
 * 		2�������н��ߣ�ConcreteMediator����ɫ��ʵ���н��߽ӿڣ�����һ�� List ������ͬ�¶���Э������ͬ�½�ɫ֮��Ľ�����ϵ�������������ͬ�½�ɫ��
 * 		3������ͬ���ࣨColleague����ɫ������ͬ����Ľӿڣ������н��߶����ṩͬ�¶��󽻻��ĳ��󷽷���ʵ�������໥Ӱ���ͬ����Ĺ������ܡ�
 * 		4������ͬ���ࣨConcrete Colleague����ɫ���ǳ���ͬ�����ʵ���ߣ�����Ҫ������ͬ�¶��󽻻�ʱ�����н��߶���������Ľ�����
 */
public class MediatorClient {
	public static void main(String[] args) {
		Mediator md = new ConcreteMediator();
		Colleague cA = new ConcreteColleagueA();
		Colleague cB = new ConcreteColleagueB();
		md.register(cA);
		md.register(cB);
		cA.send();
		System.out.println("��������������������������������������������");
		cB.send();
	}
}
