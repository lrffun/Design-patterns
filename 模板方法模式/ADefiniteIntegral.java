package 模板方法模式;

public abstract class ADefiniteIntegral {
	abstract protected double geta();	//积分下限（钩子方法）
	abstract protected double getb();	//积分上限
	abstract protected int getc();		//切分多少份
	abstract protected double function(double x);	//被积函数
	
	public final double CalDefiniteIntegral() {		//积分方法
		double a=0,b=0,t=0,sum=0;
		int c=0;
		a=geta();
		b=getb();
		c=getc();
		if(a>b) {
			t=a;
			a=b;
			b=t;
		}
		t=(b-a)/(double)c;
		for(int i=0;i<c;i++) {
			sum=sum+t*function(a+i*t);
		}
		
		return sum;
	}
}
