package �н���ģʽ;

public class ConcreteColleagueB extends Colleague{		//����ͬ����
	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("ͬ��B�յ�����");
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("ͬ��B��������");
		mediator.relay(this); 	//���н���ת��
	}	
}
