package װ��ģʽ;

public class ConcreteDecoratorB extends Decorator{	//����װ����
	
	public ConcreteDecoratorB(Component component) {
		// TODO Auto-generated constructor stub
		super(component);
	}
	
	private void bMethod() {
		System.out.println("���ʵ�Bװ�����b����");
	}
	
	@Override
	public void operation() {
		super.operation();
		this.bMethod();
	}
}
