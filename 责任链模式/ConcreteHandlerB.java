package ������ģʽ;

public class ConcreteHandlerB extends Handler{		//���崦����B
	
	@Override
	public void handlerRequest(String request) {
		// TODO Auto-generated method stub
		if(request.contentEquals("B")) {
			System.out.println("���崦����B����������󣡣���");
		}else {
			if(getNext()!=null) {
				getNext().handlerRequest(request);
			}else {
				System.out.println("û���˴�������󣡣���");
			}
		}
	}
}
