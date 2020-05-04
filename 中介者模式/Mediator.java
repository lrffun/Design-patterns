package 中介者模式;

public interface Mediator {	//抽象中介者
	public void register(Colleague colleague);		//注册
	public void relay(Colleague colleague);	//转发
}
