package ������ģʽ;

public class ConcreteVisitorA implements Visitor{		//���������A
	public void visit(ConcreteElementA element) {
		System.out.println("���������A���ʡ���>"+element.operationA());
	}
	
	public void visit(ConcreteElementB element) {
		System.out.println("���������A���ʡ���>"+element.operationB());
	}
}
