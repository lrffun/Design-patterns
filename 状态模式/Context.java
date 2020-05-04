package 状态模式;

public class Context {		//环境类
	private State state;
	public Context() {	//设置初始状态
		this.state = new ConcreteStateA();
	}
	
	public void setState(State state) {	//设置新状态
		this.state = state;
	}
	
	public State getState() {	//获取当前状态
		return state;
	}
	
	public void Handle() {
		state.Handle(this);
	}
}
