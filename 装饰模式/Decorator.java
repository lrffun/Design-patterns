package 装饰模式;

public class Decorator implements Component{	//抽象装饰类
	
	private Component component = null;
	
	public Decorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		if(component != null) {
			this.component.operation();
		}
	}

}
