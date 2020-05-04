package �۲���ģʽ;
/*
 * �۲���ģʽ��ָ�����������һ�Զ��������ϵ����һ�������״̬�����ı�ʱ���������������Ķ��󶼵õ�֪ͨ�����Զ����¡�����ģʽ��ʱ�ֳ�������-����ģʽ��ģ��-��ͼģʽ�����Ƕ�����Ϊ��ģʽ��
 * ģʽ�ṹ��
 * 		1���������⣨Subject����ɫ��Ҳ�г���Ŀ���࣬���ṩ��һ�����ڱ���۲��߶���ľۼ�������ӡ�ɾ���۲��߶���ķ������Լ�֪ͨ���й۲��ߵĳ��󷽷���
 * 		2���������⣨Concrete    Subject����ɫ��Ҳ�о���Ŀ���࣬��ʵ�ֳ���Ŀ���е�֪ͨ������������������ڲ�״̬�����ı�ʱ��֪ͨ����ע����Ĺ۲��߶���
 * 		3������۲��ߣ�Observer����ɫ������һ���������ӿڣ���������һ�������Լ��ĳ��󷽷������ӵ���������ĸ���֪ͨʱ�����á�
 * 		4������۲��ߣ�Concrete Observer����ɫ��ʵ�ֳ���۲����ж���ĳ��󷽷����Ա��ڵõ�Ŀ��ĸ���֪ͨʱ���������״̬��
 */
public class ObserverClient {
	public static void main(String[] args) {
		Subject subjectA = new ConcreteSubjectA();
		Subject subjectB = new ConcreteSubjectB();
		Observer obsA = new ConcreteObserverA();
		Observer obsB = new ConcreteObserverB();
		subjectA.add(obsA);
		subjectA.add(obsB);
		subjectB.add(obsA);
		subjectB.add(obsB);
		subjectA.notifyObserver();
		subjectB.notifyObserver();
	}
}
