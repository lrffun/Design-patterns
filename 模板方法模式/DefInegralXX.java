package ģ�巽��ģʽ;

public class DefInegralXX extends ADefiniteIntegral {	//�����������
	
	private double a,b;
	private int c;
	public DefInegralXX(double a,double b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	@Override
	protected double geta() {	//���Ǹ���Ĺ��ӷ������Ӷ����ԶԸ��෽����ִ�н���Լ����ʵ������Ը�����Ϊ�ķ������
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	protected double getb() {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	protected int getc() {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	protected double function(double x) {
		// TODO Auto-generated method stub
		return Math.log(x);
	}


}
