package 中介者模式;

public abstract class Colleague {		//抽象同事类
	protected Mediator mediator;
	public void setMedium(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void receive();

	public abstract void send();
}
