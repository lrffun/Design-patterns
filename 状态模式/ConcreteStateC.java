package ״̬ģʽ;

public class ConcreteStateC implements State{

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("����״̬������");
		context.setState(new ConcreteStateA());
	}

}
