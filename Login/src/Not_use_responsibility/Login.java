package Not_use_responsibility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	public void init() {		//初始化函数
		System.out.println("欢迎来到登陆系统！您有三次机会输入账号密码。");
	}
	
	
	public void display() {		//显示函数(利用Java swing显示效果类似)
		init();
		validata();
	}
	
	public void validata() {	//验证表单
		Scanner in = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName = in.next();
		System.out.println("请输入密码：");
		String userPassword = in.next();
		int i = 2;
		while(!findUser(userName, userPassword)&&i!=0){			
			System.out.println("抱歉，您输入的用户名或密码错误，您还有"+(i--)+"次机会，请重新输入！！！");
			System.out.println("请输入用户名：");
			userName = in.next();
			System.out.println("请输入密码：");
			userPassword = in.next();
		}
		if(i==0||!findUser(userName,userPassword)) {
			System.out.println("您已多次输入错误，系统关闭！");
		}else {
			System.out.println("恭喜你，成功登录系统！！！");
		}
	}
	
	@SuppressWarnings("finally")
	public Connection getConnection() {		//连接数据库函数
		Connection c = null;
		 try {
			 
				 Class.forName("com.mysql.cj.jdbc.Driver"); 	//加载驱动
				 //连接数据库（本地建库login，建表user）
				 c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login?serverTimezone=UTC&characterEncoding=UTF-8", "root", "123");
				 			
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return c;
			}
		 
	}
	
	public boolean findUser(String UserName,String UserPassword) {		//寻找用户信息函数
		//得到连接对象
		Connection c = getConnection();
		//包装SQL语句
		String SQL = "select * from user where name = '" + UserName + "' and password = '" + UserPassword + "'";
		//得到statement对象
		Statement s = null;
		
		boolean findOrNot = false;
		try {
			s = c.createStatement();
			//执行SQL语句。
			ResultSet rs = s.executeQuery(SQL);
			if(rs.next()) {	//判断是否有返回结果。
                findOrNot = true;
            } else {
            	findOrNot = false;
            }
       
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return findOrNot;
	}

	
	public static void main(String[] args) {			//主函数
		Login l = new Login();
		l.display();
	}
}
