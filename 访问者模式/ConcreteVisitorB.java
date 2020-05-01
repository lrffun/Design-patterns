package 访问者模式;

public class ConcreteVisitorB implements Visitor{		//具体访问者B
	public void visit(ConcreteElementA element) {
		System.out.println("具体访问者B访问——>"+element.operationA());
	}
	
	public void visit(ConcreteElementB element) {
		System.out.println("具体访问者B访问——>"+element.operationB());
	}
}
