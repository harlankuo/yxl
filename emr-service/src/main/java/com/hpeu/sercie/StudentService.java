package com.hpeu.sercie;

import java.util.List;
import com.hpeu.bean.Student;

public interface StudentService {
	//查询全部学生
	public List<Student> findAllStudent();	
	//删除学生
	public int deletStudent(Student user);
	//修改学生
	public int updateStudent(Student user );
	//添加学生
	public int addStudent(Student user);
}
