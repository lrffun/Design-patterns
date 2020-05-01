package 备忘录模式;
	
public class Memento {	//备忘录类
	private String state;
	public Memento(String state) {
		// TODO Auto-generated constructor stub
		this.state=state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
}
