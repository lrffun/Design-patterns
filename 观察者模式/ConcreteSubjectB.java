package 观察者模式;

public class ConcreteSubjectB extends Subject{	//具体观察者B
	private String kind = "B";
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("——————————————————");
		System.out.println("目标B发生改变！！！");
		for(Object obs:observers) {			//通知所有观察者
			((Observer)obs).response(this.kind);
		}

	}	

}
