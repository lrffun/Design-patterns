package Not_use_responsibility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	public void init() {		//��ʼ������
		System.out.println("��ӭ������½ϵͳ���������λ��������˺����롣");
	}
	
	
	public void display() {		//��ʾ����(����Java swing��ʾЧ������)
		init();
		validata();
	}
	
	public void validata() {	//��֤��
		Scanner in = new Scanner(System.in);
		System.out.println("�������û�����");
		String userName = in.next();
		System.out.println("���������룺");
		String userPassword = in.next();
		int i = 2;
		while(!findUser(userName, userPassword)&&i!=0){			
			System.out.println("��Ǹ����������û������������������"+(i--)+"�λ��ᣬ���������룡����");
			System.out.println("�������û�����");
			userName = in.next();
			System.out.println("���������룺");
			userPassword = in.next();
		}
		if(i==0||!findUser(userName,userPassword)) {
			System.out.println("���Ѷ���������ϵͳ�رգ�");
		}else {
			System.out.println("��ϲ�㣬�ɹ���¼ϵͳ������");
		}
	}
	
	@SuppressWarnings("finally")
	public Connection getConnection() {		//�������ݿ⺯��
		Connection c = null;
		 try {
			 
				 Class.forName("com.mysql.cj.jdbc.Driver"); 	//��������
				 //�������ݿ⣨���ؽ���login������user��
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
	
	public boolean findUser(String UserName,String UserPassword) {		//Ѱ���û���Ϣ����
		//�õ����Ӷ���
		Connection c = getConnection();
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

	
	public static void main(String[] args) {			//������
		Login l = new Login();
		l.display();
	}
}
