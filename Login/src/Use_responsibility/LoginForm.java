package Use_responsibility;

import java.util.Scanner;

public class LoginForm {
	private UserDAO dao = new UserDAO();
	
	public void init() {		//初始化函数
		System.out.println("欢迎来到登陆系统！您有三次机会输入账号密码。");
	}
	
	
	public void display() {		//显示函数(利用Java swing显示效果类似)
		init();
		validata();
	}
	
	public void validata() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName = in.next();
		System.out.println("请输入密码：");
		String userPassword = in.next();
		int i = 2;
		while(!dao.findUser(userName, userPassword)&&i!=0){			
			System.out.println("抱歉，您输入的用户名或密码错误，您还有"+(i--)+"次机会，请重新输入！！！");
			System.out.println("请输入用户名：");
			userName = in.next();
			System.out.println("请输入密码：");
			userPassword = in.next();
		}
		if(i==0||!dao.findUser(userName,userPassword)) {
			System.out.println("您已多次输入错误，系统关闭！");
		}else {
			System.out.println("恭喜你，成功登录系统！！！");
		}
	}
}
