package ״̬ģʽ;

public class ConcreteStateB implements State{

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("�м�״̬������");
		context.setState(new ConcreteStateC());
	}

}
