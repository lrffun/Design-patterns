package ������ģʽ;

public class ConcreteHandlerA extends Handler{	//���崦����A
	
	@Override
	public void handlerRequest(String request) {
		// TODO Auto-generated method stub
		if(request.contentEquals("A")) {
			System.out.println("���崦����A����������󣡣���");
		}else {
			if(getNext()!=null) {
				getNext().handlerRequest(request);
			}else {
				System.out.println("û���˴�������󣡣���");
			}
		}
	}

}
