package 原型模式;

public class Fruits implements Cloneable{
	protected String kind;
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
