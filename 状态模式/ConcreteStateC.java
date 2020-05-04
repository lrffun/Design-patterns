package ×´Ì¬Ä£Ê½;

public class ConcreteStateC implements State{

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("½áÊø×´Ì¬£¡£¡£¡");
		context.setState(new ConcreteStateA());
	}

}
