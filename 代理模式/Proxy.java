package ����ģʽ;

public class Proxy implements Subject{	//������
	private RealSubject realSubject = null;

	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		
		preRequest();
		realSubject.request();
		postRequest();
	}
	
	private void preRequest() {
		System.out.println("����ǰ��Ԥ����");
	}
	
	private void postRequest() {
		System.out.println("�������ƺ�");
	}
	
}
