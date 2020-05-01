package 访问者模式;

public class ConcreteVisitorA implements Visitor{		//具体访问者A
	public void visit(ConcreteElementA element) {
		System.out.println("具体访问者A访问——>"+element.operationA());
	}
	
	public void visit(ConcreteElementB element) {
		System.out.println("具体访问者A访问——>"+element.operationB());
	}
}
