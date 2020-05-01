package 建造者模式;

public class ConcreteBuilder1 extends Builder{

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.setPartA("建造partA");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.setPartB("建造partB");
	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		product.setPartC("建造partC");
	}

}
