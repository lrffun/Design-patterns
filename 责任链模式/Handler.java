package ������ģʽ;

import java.util.ArrayList;
import java.util.List;

public abstract class Handler {		//����������
	private Handler next;
	public void setNext(Handler next) {
		this.next = next;
	}
	
	public Handler getNext() {
		return next;
	}
	
	public abstract void handlerRequest(String request);
}
