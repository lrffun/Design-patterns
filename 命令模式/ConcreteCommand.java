package 命令模式;

public class ConcreteCommand implements Command{	//具体命令类
	private Receiver receiver;
	public ConcreteCommand() {
		receiver = new Receiver();
	}
	public void execute() {
		receiver.action();
	}
}
