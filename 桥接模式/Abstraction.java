package �Ž�ģʽ;

public abstract class Abstraction {	//���󻯽�ɫ
	protected Implementor im;
	protected Abstraction(Implementor im) {
		this.im = im;
	}
	
	public abstract void Operation();
	
}
