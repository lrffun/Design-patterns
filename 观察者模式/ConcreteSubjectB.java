package �۲���ģʽ;

public class ConcreteSubjectB extends Subject{	//����۲���B
	private String kind = "B";
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("������������������������������������");
		System.out.println("Ŀ��B�����ı䣡����");
		for(Object obs:observers) {			//֪ͨ���й۲���
			((Observer)obs).response(this.kind);
		}

	}	

}
