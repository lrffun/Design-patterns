package 建造者模式;

public class Product {		//产品类
	String partA = null;
	String partB = null;
	String partC = null;
	
	public void setPartA(String partA) {
		this.partA = partA;
	}
	
	public void setPartB(String partB) {
		this.partB = partB;
	}
	
	public void setPartC(String partC) {
		this.partC = partC;
	}
	
	public void show() {
		System.out.println(partA);
		System.out.println(partB);
		System.out.println(partC);
	}
}
