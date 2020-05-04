package 组合模式;

public interface Component {	//抽象构件
	public void add(Component c);
	public void remove(Component c);
	public Component getChild(int i);
	public void operation();
}
