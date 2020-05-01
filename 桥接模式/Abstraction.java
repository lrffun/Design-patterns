package 桥接模式;

public abstract class Abstraction {	//抽象化角色
	protected Implementor im;
	protected Abstraction(Implementor im) {
		this.im = im;
	}
	
	public abstract void Operation();
	
}
