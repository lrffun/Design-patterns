package 简单工厂模式;

public class ComputerFactory {
	//电脑工厂类
	public Computer productComputer(String computerName) {	//生产计算机类
		Computer myComputer = null;
		switch(computerName) {
			case "HP":myComputer = new HPComputer();break;
			case "Lenovo":myComputer = new LenovoComputer();break;
			case "Aliens":myComputer = new AliensComputer();break;
			default:System.out.println("抱歉，没有你要的电脑！");break;
		}
		return myComputer;
	}
}
