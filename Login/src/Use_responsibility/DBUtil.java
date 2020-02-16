package Use_responsibility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
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
}
