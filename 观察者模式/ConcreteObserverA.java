package 观察者模式;

public class ConcreteObserverA implements Observer{//具体观察者A

	@Override
	public void response(String kind) {
		// TODO Auto-generated method stub
		System.out.println("观察者A收到目标"+kind+"发生改变，具体观察者A做出反应！！！");
	}	

}
