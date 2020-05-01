package 访问者模式;

public class ConcreteElementA implements Element{	//具体元素A

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	public String operationA() {
		return "访问具体元素A";
	}
	
}
