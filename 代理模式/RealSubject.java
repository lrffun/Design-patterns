package 代理模式;

public class RealSubject implements Subject{ //真实主题类

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("访问真实主题类");
	}	//真实主题类
	
}
