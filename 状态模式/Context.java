package ״̬ģʽ;

public class Context {		//������
	private State state;
	public Context() {	//���ó�ʼ״̬
		this.state = new ConcreteStateA();
	}
	
	public void setState(State state) {	//������״̬
		this.state = state;
	}
	
	public State getState() {	//��ȡ��ǰ״̬
		return state;
	}
	
	public void Handle() {
		state.Handle(this);
	}
}
