package 观察者模式;

public class ConcreteObserverB implements Observer{		//具体观察者B

	@Override
	public void response(String kind) {
		// TODO Auto-generated method stub
		System.out.println("观察者B收到目标"+kind+"做出改变，具体观察者B做出反应！！！");
	}		

}
