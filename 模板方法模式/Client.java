package 模板方法模式;

public class Client {	//用户类
	public static void main(String[] args) {
		ADefiniteIntegral[] a = new ADefiniteIntegral[2];
		
		a[0] = new DefInegralXX(1, 20, 1000);
		a[1] = new SquareEquation(0, 10, 1000);
		for(int i = 0;i < 2;i++) {
			System.out.println(a[i].CalDefiniteIntegral());
		}
		
	}
}
