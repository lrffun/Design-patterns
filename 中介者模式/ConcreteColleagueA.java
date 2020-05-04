package 中介者模式;

public class ConcreteColleagueA extends Colleague{//具体同事类

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("同事A收到请求");
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("同事A发出请求");
		mediator.relay(this); 	//请中介者转发
	}	
	
}
