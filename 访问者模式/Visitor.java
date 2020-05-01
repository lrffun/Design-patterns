package 访问者模式;

public interface Visitor {		//抽象访问者类
	public void visit(ConcreteElementA element);
	public void visit(ConcreteElementB element);
}
