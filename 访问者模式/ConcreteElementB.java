package ������ģʽ;

public class ConcreteElementB implements Element{ 	//����Ԫ��B

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}		
	
	public String operationB() {
		return "���ʾ���Ԫ��B";
	}

}
