package ������ģʽ;

public class ConcreteHandlerC extends Handler{
	@Override
	public void handlerRequest(String request) {
		// TODO Auto-generated method stub
		if(request.contentEquals("C")) {
			System.out.println("���崦����C����������󣡣���");
		}else {
			if(getNext()!=null) {
				getNext().handlerRequest(request);
			}else {
				System.out.println("û���˴�������󣡣���");
			}
		}
	}
}
