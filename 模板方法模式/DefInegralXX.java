package 模板方法模式;

public class DefInegralXX extends ADefiniteIntegral {	//求对数积分类
	
	private double a,b;
	private int c;
	public DefInegralXX(double a,double b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	@Override
	protected double geta() {	//覆盖父类的钩子方法，从而可以对父类方法的执行进行约束，实现子类对父类行为的反向控制
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	protected double getb() {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	protected int getc() {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	protected double function(double x) {
		// TODO Auto-generated method stub
		return Math.log(x);
	}


}
