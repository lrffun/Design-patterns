package 迭代器模式;

import java.util.ArrayList;

public class ConcreteAggregate implements Aggregate{
	
	private ArrayList<Object> list=new ArrayList<>();
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		list.add(obj);
	}

	@Override
	public void remove(Object obj) {
		// TODO Auto-generated method stub
		list.remove(obj);
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return (new ConcreteIterator(list));
	}	//具体聚合类
	
}
