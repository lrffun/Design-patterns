package ������ģʽ;

public class ConcreteVisitorB implements Visitor{		//���������B
	public void visit(ConcreteElementA element) {
		System.out.println("���������B���ʡ���>"+element.operationA());
	}
	
	public void visit(ConcreteElementB element) {
		System.out.println("���������B���ʡ���>"+element.operationB());
	}
}
