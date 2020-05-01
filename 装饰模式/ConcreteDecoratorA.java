package 装饰模式;

public class ConcreteDecoratorA extends Decorator{	//具体装饰类
	
	public ConcreteDecoratorA(Component component) {	//定义被修饰者
		// TODO Auto-generated constructor stub
		super(component);
	}
	
	private void aMethod() {
		System.out.println("访问到A装饰类的a方法");
	}
	
	@Override
	public void operation() {
		this.aMethod();
		super.operation();
	}
}
