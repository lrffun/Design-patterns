package 责任链模式;

public class ConcreteHandlerB extends Handler{		//具体处理者B
	
	@Override
	public void handlerRequest(String request) {
		// TODO Auto-generated method stub
		if(request.contentEquals("B")) {
			System.out.println("具体处理者B负责处理该请求！！！");
		}else {
			if(getNext()!=null) {
				getNext().handlerRequest(request);
			}else {
				System.out.println("没有人处理该请求！！！");
			}
		}
	}
}
