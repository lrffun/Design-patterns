package ��Ԫģʽ;

import java.util.HashMap;

public class FlyweightFactory {		//��Ԫ������
	private HashMap<String,Flyweight> flyweights = new HashMap<String,Flyweight>();
	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = (Flyweight)flyweights.get(key);
		if(flyweight==null) {
			flyweight = new ConcreteFlyweight(key);
			flyweights.put(key,flyweight);
		}else {
			System.out.println("��Ԫ"+key+"�Ѿ����ڣ��ѻ�ȡ������");
		}
		return flyweight;
	}
}
