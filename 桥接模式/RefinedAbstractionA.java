package 桥接模式;

public class RefinedAbstractionA extends Abstraction{
	protected RefinedAbstractionA(Implementor im) {
		super(im);
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("访问到RefindAbstractionA！！！");
		im.OperationIm();
	}
}
