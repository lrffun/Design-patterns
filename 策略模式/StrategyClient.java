package ����ģʽ;

public class StrategyClient {
	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new ConcreteStrategyA());
		context.strategyMethod();
		context.setStrategy(new ConcreteStrategyB());
		context.strategyMethod();
	}
}
