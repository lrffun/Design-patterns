package 备忘录模式;

public class Caretaker {	//管理者
	private Memento memento;
	public void setMemento(Memento m) {
		memento=m;
	}
	public Memento getMemento() {
		return memento;
	}
}
