package 迭代器模式;

import java.util.ArrayList;

public class ConcreteIterator implements Iterator{
	
	private ArrayList<Object> list = null;
	private int index = -1;		//游标
	
	public ConcreteIterator(ArrayList<Object> list) {
		this.list = list;
	}
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		index = 0;
		return list.get(0);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object next = null;
		if(hasNext()) {
			next = list.get(++index);
		}else {
			next = "没有下一个了";
		}
		return next;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index<list.size()-1) {
			return true;
		}else {
			return false;
		}
	}	//具体迭代器类
	
}
