package Use_responsibility;

import java.util.Scanner;

public class LoginForm {
	private UserDAO dao = new UserDAO();
	
	public void init() {		//��ʼ������
		System.out.println("��ӭ������½ϵͳ���������λ��������˺����롣");
	}
	
	
	public void display() {		//��ʾ����(����Java swing��ʾЧ������)
		init();
		validata();
	}
	
	public void validata() {
		Scanner in = new Scanner(System.in);
		System.out.println("�������û�����");
		String userName = in.next();
		System.out.println("���������룺");
		String userPassword = in.next();
		int i = 2;
		while(!dao.findUser(userName, userPassword)&&i!=0){			
			System.out.println("��Ǹ����������û������������������"+(i--)+"�λ��ᣬ���������룡����");
			System.out.println("�������û�����");
			userName = in.next();
			System.out.println("���������룺");
			userPassword = in.next();
		}
		if(i==0||!dao.findUser(userName,userPassword)) {
			System.out.println("���Ѷ���������ϵͳ�رգ�");
		}else {
			System.out.println("��ϲ�㣬�ɹ���¼ϵͳ������");
		}
	}
}
