package com.hpeu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hpeu.bean.Student;

public interface StudentMapper {
	//查询全部学生
	public List<Student> findAllStudent();	
	//删除学生
	public int deletStudent(int id);
	//修改学生
	public int updateStudent(Student stu );
	//添加学生
	public int addStudent(Student stu);
	
	//动态查询
	public List<Student> findStudentByTrim(@Param("batchId") String batchId,
			@Param("techId") String techId,@Param("classId") String classId,
			@Param("school") String school,@Param("education") String education,
			@Param("name") String name,@Param("phone") String phone
			);
}
