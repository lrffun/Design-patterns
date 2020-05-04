package 命令模式;

public class Invoker {	//调用者
	private Command command;
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void call() {
		System.out.println("掉用执行命令command！！！");
		command.execute();
	}
}
