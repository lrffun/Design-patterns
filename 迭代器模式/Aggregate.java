package 迭代器模式;

interface Aggregate {	//抽象聚合类
	public void add(Object obj);
	public void remove(Object obj);
	public Iterator getIterator();
}
