package 桥接模式;

public class RefinedAbstractionB extends Abstraction{
	protected RefinedAbstractionB(Implementor im) {
		super(im);
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("访问到RefindAbstractionB！！！");
		im.OperationIm();
	}
}
