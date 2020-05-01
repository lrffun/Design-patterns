package 备忘录模式;
/*
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态。该模式又叫快照模式。
 * 模式结构：	
 * 		1、发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 * 		2、备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 * 		3、管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 */
public class MementoClient {
	public static void main(String[] args) {
		Originator or = new Originator();	//创建发起人
		Caretaker cr = new Caretaker();		//创建管理者
		or.setState("S0");					//发起人初始状态
		System.out.println("初始状态："+or.getState());
		cr.setMemento(or.createMemento());	//保存状态
		or.setState("S1");					//给予新状态
		System.out.println("新的状态："+or.getState());
		or.restoreMemento(cr.getMemento());	//恢复状态
		System.out.println("恢复状态："+or.getState());
	}
}
