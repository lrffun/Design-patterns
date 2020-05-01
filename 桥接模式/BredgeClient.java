package �Ž�ģʽ;
/*
 * �Ž�ģʽ����������ʵ�ַ��룬ʹ���ǿ��Զ����仯����������Ϲ�ϵ����̳й�ϵ��ʵ�֣��Ӷ������˳����ʵ���������ɱ�ά�ȵ���϶ȡ�
 * ģʽ�ṹ��
 * 		1�����󻯣�Abstraction����ɫ����������࣬������һ����ʵ�ֻ���������á�		
 * 		2����չ���󻯣�Refined    Abstraction����ɫ���ǳ��󻯽�ɫ�����࣬ʵ�ָ����е�ҵ�񷽷�����ͨ����Ϲ�ϵ����ʵ�ֻ���ɫ�е�ҵ�񷽷���
 * 		3��ʵ�ֻ���Implementor����ɫ������ʵ�ֻ���ɫ�Ľӿڣ�����չ���󻯽�ɫ���á�
 * 		4������ʵ�ֻ���Concrete Implementor����ɫ������ʵ�ֻ���ɫ�ӿڵľ���ʵ�֡�
 */
public class BredgeClient {
	public static void main(String[] args) {
		Implementor im = new ConcreteImplementorA();
		Implementor im2 = new ConcreteImplementorB();
		Abstraction abs = new RefinedAbstractionA(im);
		Abstraction abs2 = new RefinedAbstractionB(im2);
		abs.Operation();
		abs2.Operation();
	}
}
