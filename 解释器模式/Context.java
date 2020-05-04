package 解释器模式;

public class Context {	//环境类
	private AbstractExpression exp;
	public Context() {
		//数据初始化
	}
	
	public void operation(String info) {
		//调用相关表达式类的解释方法
	}
}
