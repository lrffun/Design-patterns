package 责任链模式;

public class ConcreteHandlerC extends Handler{
	@Override
	public void handlerRequest(String request) {
		// TODO Auto-generated method stub
		if(request.contentEquals("C")) {
			System.out.println("具体处理者C负责处理该请求！！！");
		}else {
			if(getNext()!=null) {
				getNext().handlerRequest(request);
			}else {
				System.out.println("没有人处理该请求！！！");
			}
		}
	}
}
