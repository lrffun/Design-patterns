package ����ģʽ;

public class Context {	//������
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public Strategy getStategy() {
		return strategy;
	}
	
	public void strategyMethod() {
		strategy.strategyMethod();
	}
}
