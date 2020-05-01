package 外观模式;
/*
 * 外观模式：是一种通过为多个复杂的子系统提供一个统一的接口，而使这些子系统更加容易被访问的模式，该模式对外有一个
 * 			统一接口，外部应用程序不用关心内部子系统的具体的细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。
 * 模式结构：
 * 		1、外观（Facade）角色：为多个子系统对外提供一个共同的接口。
 * 		2、子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
 * 		3、客户（Client）角色：通过一个外观角色访问各个子系统的功能。
 */
public class FacadeClient {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.allMethod();
	}
}
