package �򵥹���ģʽ;

public class ComputerFactory {
	//���Թ�����
	public Computer productComputer(String computerName) {	//�����������
		Computer myComputer = null;
		switch(computerName) {
			case "HP":myComputer = new HPComputer();break;
			case "Lenovo":myComputer = new LenovoComputer();break;
			case "Aliens":myComputer = new AliensComputer();break;
			default:System.out.println("��Ǹ��û����Ҫ�ĵ��ԣ�");break;
		}
		return myComputer;
	}
}
