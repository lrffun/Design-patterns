package 合成复用原则;

import java.util.List;

public class TeacherDAO {
	private DBUtil dBOperator = null;
	public void setDBOprator(DBUtil dBOperator) {}
	public TeacherDAO findTeacherByid(String id) {
		return new TeacherDAO();
	}
	public List<TeacherDAO> findAllTeachers(){
		return null;
	}
	public int save(TeacherDAO teacher) {
		return 0;
	}
}
