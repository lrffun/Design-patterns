package 合成复用原则;

import java.util.List;

public class StudentDAO {
	private DBUtil dBOperator = null;
	public void setDBOprator(DBUtil dBOperator) {}
	public StudentDAO findStudentByid(String id) {
		return new StudentDAO();
	}
	public List<StudentDAO> findAllStudents(){
		return null;
	}
	public int save(StudentDAO student) {
		return 0;
	}
}
