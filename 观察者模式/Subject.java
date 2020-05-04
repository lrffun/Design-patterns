package �۲���ģʽ;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {		//����Ŀ��
	protected List<Observer> observers = new ArrayList<Observer>();	//�۲��߼���
	
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	public abstract void notifyObserver();	//֪ͨ�۲��߷���
}
