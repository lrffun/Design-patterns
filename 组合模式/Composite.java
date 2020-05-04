package 组合模式;

import java.util.ArrayList;

public class Composite implements Component{	//树枝类
	private ArrayList<Component> children = new ArrayList<Component>();

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return children.get(i);
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		for(Component c:children) {
			c.operation();
		}
	}
	
}
