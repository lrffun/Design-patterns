package װ��ģʽ;

public class ConcreteDecoratorA extends Decorator{	//����װ����
	
	public ConcreteDecoratorA(Component component) {	//���屻������
		// TODO Auto-generated constructor stub
		super(component);
	}
	
	private void aMethod() {
		System.out.println("���ʵ�Aװ�����a����");
	}
	
	@Override
	public void operation() {
		this.aMethod();
		super.operation();
	}
}
