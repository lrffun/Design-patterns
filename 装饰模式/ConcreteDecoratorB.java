package 装饰模式;

public class ConcreteDecoratorB extends Decorator{	//具体装饰类
	
	public ConcreteDecoratorB(Component component) {
		// TODO Auto-generated constructor stub
		super(component);
	}
	
	private void bMethod() {
		System.out.println("访问到B装饰类的b方法");
	}
	
	@Override
	public void operation() {
		super.operation();
		this.bMethod();
	}
}
