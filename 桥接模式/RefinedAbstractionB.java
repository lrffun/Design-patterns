package �Ž�ģʽ;

public class RefinedAbstractionB extends Abstraction{
	protected RefinedAbstractionB(Implementor im) {
		super(im);
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("���ʵ�RefindAbstractionB������");
		im.OperationIm();
	}
}
