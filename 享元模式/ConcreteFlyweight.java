package 享元模式;

public class ConcreteFlyweight implements Flyweight{	//具体享元类
	
	private String key;
	public ConcreteFlyweight(String key) {
		// TODO Auto-generated constructor stub
		this.key = key;
		System.out.println("具体享元"+key+"被创建！！！");
	}
	@Override
	public void operation(UnsharedConcreteFlyweight state) {
		// TODO Auto-generated method stub
		System.out.println("具体享元"+key+"被调用！！！");
		System.out.println("非享元："+state.getInfo());
	}
	
}
