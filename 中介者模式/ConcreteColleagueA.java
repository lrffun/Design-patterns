package �н���ģʽ;

public class ConcreteColleagueA extends Colleague{//����ͬ����

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("ͬ��A�յ�����");
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("ͬ��A��������");
		mediator.relay(this); 	//���н���ת��
	}	
	
}
