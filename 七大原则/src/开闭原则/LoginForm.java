package ����ԭ��;

public class LoginForm {
	private AbstractButton button = getConfigButton();
	
	public void display() {
		button.view();
	}
	
	private AbstractButton getConfigButton() {
		//����xml�ļ������ٶȿ���̫����ֱ��new��
		AbstractButton myButton = new CircleButton();
		return myButton;
	}
}
