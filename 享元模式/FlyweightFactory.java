package 享元模式;

import java.util.HashMap;

public class FlyweightFactory {		//享元工厂类
	private HashMap<String,Flyweight> flyweights = new HashMap<String,Flyweight>();
	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = (Flyweight)flyweights.get(key);
		if(flyweight==null) {
			flyweight = new ConcreteFlyweight(key);
			flyweights.put(key,flyweight);
		}else {
			System.out.println("享元"+key+"已经存在，已获取！！！");
		}
		return flyweight;
	}
}
