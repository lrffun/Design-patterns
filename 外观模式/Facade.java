package ���ģʽ;

public class Facade {	//�����
	SubSystem1 system1 = null;
	SubSystem2 system2 = null;
	SubSystem3 system3 = null;
	
	public Facade() {
		system1 = new SubSystem1();
		system2 = new SubSystem2();
		system3 = new SubSystem3();
	}
	
	public void allMethod(){
		method1();
		method2();
		method3();
	}
	
	public void method1() {
		system1.myMethod();
	}
	
	public void method2() {
		system2.myMethod();
	}
	
	public void method3() {
		system3.myMethod();
	}
}
