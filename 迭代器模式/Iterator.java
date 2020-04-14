package 迭代器模式;

interface Iterator {		//抽象迭代器
	public Object first();
	public Object next();
	public boolean hasNext();
}
