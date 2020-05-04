package 状态模式;

public class ConcreteStateA implements State{

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("起始状态！！！");
		context.setState(new ConcreteStateB());
	}

}
