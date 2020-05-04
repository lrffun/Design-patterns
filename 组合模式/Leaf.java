package 组合模式;

public class Leaf implements Component{	//叶子类
	
	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Component c) {}

	@Override
	public void remove(Component c) {}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("叶子"+name+"：被访问！");
	}	

}
