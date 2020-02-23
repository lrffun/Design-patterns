package 开闭原则;

public class LoginForm {
	private AbstractButton button = getConfigButton();
	
	public void display() {
		button.view();
	}
	
	private AbstractButton getConfigButton() {
		//解析xml文件；（百度看不太懂就直接new）
		AbstractButton myButton = new CircleButton();
		return myButton;
	}
}
