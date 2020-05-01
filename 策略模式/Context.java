package 策略模式;

public class Context {	//环境类
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
