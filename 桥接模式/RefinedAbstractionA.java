package �Ž�ģʽ;

public class RefinedAbstractionA extends Abstraction{
	protected RefinedAbstractionA(Implementor im) {
		super(im);
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("���ʵ�RefindAbstractionA������");
		im.OperationIm();
	}
}
