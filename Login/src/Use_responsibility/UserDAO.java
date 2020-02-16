package Use_responsibility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	private DBUtil db = new DBUtil();
	public boolean findUser(String UserName,String UserPassword) {		//寻找用户信息函数
		//得到连接对象
		Connection c = db.getConnection();
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
}
