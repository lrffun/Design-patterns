package ģ�巽��ģʽ;

public class SquareEquation extends ADefiniteIntegral{		//��ƽ��������
	private double a;
	private double b;
	private int c;
	
	public SquareEquation(double a,double b,int c) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	@Override
	protected double geta() {
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
		return x*x;
	}

}
