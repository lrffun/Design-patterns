package 享元模式;

public class UnsharedConcreteFlyweight {	//非享元类
	private String info;
	public UnsharedConcreteFlyweight(String info) {
		// TODO Auto-generated constructor stub
		this.info = info;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
}
