package Use_responsibility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	private DBUtil db = new DBUtil();
	public boolean findUser(String UserName,String UserPassword) {		//Ѱ���û���Ϣ����
		//�õ����Ӷ���
		Connection c = db.getConnection();
		//��װSQL���
		String SQL = "select * from user where name = '" + UserName + "' and password = '" + UserPassword + "'";
		//�õ�statement����
		Statement s = null;
		
		boolean findOrNot = false;
		try {
			s = c.createStatement();
			//ִ��SQL��䡣
			ResultSet rs = s.executeQuery(SQL);
			if(rs.next()) {	//�ж��Ƿ��з��ؽ����
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
