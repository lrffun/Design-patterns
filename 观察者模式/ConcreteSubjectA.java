package �۲���ģʽ;

public class ConcreteSubjectA extends Subject{	//����Ŀ��A
	private String kind = "A";
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("������������������������������������");
		System.out.println("Ŀ��A�����ı䣡����");
		
		for(Object obs:observers) {			//֪ͨ���й۲���
			((Observer)obs).response(this.kind);
		}

	}	
	
}
