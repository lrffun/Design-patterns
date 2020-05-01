package 访问者模式;

public class ConcreteElementB implements Element{ 	//具体元素B

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}		
	
	public String operationB() {
		return "访问具体元素B";
	}

}
