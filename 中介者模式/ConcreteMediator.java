package 中介者模式;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{//具体中介者
	
	private List<Colleague> colleagues = new ArrayList<Colleague>();
	
	@Override
	public void register(Colleague colleague) {
		// TODO Auto-generated method stub
		if(!colleagues.contains(colleague)) {
			colleagues.add(colleague);
			colleague.setMedium(this);
		}
	}

	@Override
	public void relay(Colleague colleague) {
		// TODO Auto-generated method stub
		for(Colleague ob:colleagues) {
			if(!ob.equals(colleague)) {
				ob.receive();
			}
		}
	}		
	
}
