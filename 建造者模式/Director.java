package 建造者模式;

public class Director {
	private Builder builder = null;
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Product construct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.getResult();
	}
}
