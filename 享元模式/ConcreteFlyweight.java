package ��Ԫģʽ;

public class ConcreteFlyweight implements Flyweight{	//������Ԫ��
	
	private String key;
	public ConcreteFlyweight(String key) {
		// TODO Auto-generated constructor stub
		this.key = key;
		System.out.println("������Ԫ"+key+"������������");
	}
	@Override
	public void operation(UnsharedConcreteFlyweight state) {
		// TODO Auto-generated method stub
		System.out.println("������Ԫ"+key+"�����ã�����");
		System.out.println("����Ԫ��"+state.getInfo());
	}
	
}
