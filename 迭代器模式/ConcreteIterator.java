package ������ģʽ;

import java.util.ArrayList;

public class ConcreteIterator implements Iterator{
	
	private ArrayList<Object> list = null;
	private int index = -1;		//�α�
	
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
			next = "û����һ����";
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
	}	//�����������
	
}
