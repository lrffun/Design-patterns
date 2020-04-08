package 简单工厂模式;

public class AliensComputer extends Computer {
	//实际电脑类
	@Override
	public void start() { //实现抽象方法
		// TODO Auto-generated method stub
		System.out.println("开始生产戴尔外星人！！！");
	}
}
