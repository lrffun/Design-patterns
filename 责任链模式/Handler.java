package 责任链模式;

import java.util.ArrayList;
import java.util.List;

public abstract class Handler {		//抽象处理者类
	private Handler next;
	public void setNext(Handler next) {
		this.next = next;
	}
	
	public Handler getNext() {
		return next;
	}
	
	public abstract void handlerRequest(String request);
}
