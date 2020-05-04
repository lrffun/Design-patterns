package 观察者模式;

public class ConcreteSubjectA extends Subject{	//具体目标A
	private String kind = "A";
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("——————————————————");
		System.out.println("目标A发生改变！！！");
		
		for(Object obs:observers) {			//通知所有观察者
			((Observer)obs).response(this.kind);
		}

	}	
	
}
