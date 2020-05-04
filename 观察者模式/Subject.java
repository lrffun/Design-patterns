package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {		//抽象目标
	protected List<Observer> observers = new ArrayList<Observer>();	//观察者集合
	
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	public abstract void notifyObserver();	//通知观察者方法
}
