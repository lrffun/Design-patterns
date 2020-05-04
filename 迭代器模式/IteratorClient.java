package 迭代器模式;
/*迭代器（Iterator）模式的定义：提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。迭代器模式是一种对象行为型模式
 * 模式结构：
 * 		1、抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
 * 		2、具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 * 		3、抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
 * 		4、具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 * 
 */
public class IteratorClient {
	public static void main(String[] args) {
		Aggregate agg = new ConcreteAggregate();
		agg.add("HP");
		agg.add("Lenovo");
		agg.add("Ailens");
		agg.add("TCL");
		Iterator it = agg.getIterator();	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(it.next());
	}
}
