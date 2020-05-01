package 代理模式;

public class Proxy implements Subject{	//代理类
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
		System.out.println("请求前的预处理");
	}
	
	private void postRequest() {
		System.out.println("请求后的善后");
	}
	
}
