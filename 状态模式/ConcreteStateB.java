package 状态模式;

public class ConcreteStateB implements State{

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("中间状态！！！");
		context.setState(new ConcreteStateC());
	}

}
