package ״̬ģʽ;

public class ConcreteStateA implements State{

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("��ʼ״̬������");
		context.setState(new ConcreteStateB());
	}

}
