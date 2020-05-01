package 原型模式;
/*
 * 原型模式：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。在这里，原型实例指定了要创建的对象的种类。
 * 模式结构：
 * 		1、抽象原型类：规定了具体原型对象必须实现的接口。
 * 		2、具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 * 		3、访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 */


public class PrototypeClient {	
	public static void main(String[] args) {
		Fruits apple = new Apple();
		Fruits apple2 = (Apple)apple.clone();
		System.out.println("第一个苹果哈希值："+apple.hashCode());
		System.out.println("第二个苹果哈希值："+apple2.hashCode());
	}
}
