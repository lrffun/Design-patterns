package ����ģʽ;

public class ConcreteCommand implements Command{	//����������
	private Receiver receiver;
	public ConcreteCommand() {
		receiver = new Receiver();
	}
	public void execute() {
		receiver.action();
	}
}
