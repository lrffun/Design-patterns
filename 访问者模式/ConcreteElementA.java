package ������ģʽ;

public class ConcreteElementA implements Element{	//����Ԫ��A

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	public String operationA() {
		return "���ʾ���Ԫ��A";
	}
	
}
