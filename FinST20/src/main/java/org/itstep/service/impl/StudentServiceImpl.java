package org.itstep.service.impl;

import java.util.List;

import javax.management.Query;

import org.itstep.dao.StudentDAO;
import org.itstep.dao.pojo.Student;
import org.itstep.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDAO studentDAO;

	@Override
	public Student getStudent(String login) {
		return studentDAO.findOne(login);
	}

	@Override
	public Student createAndUpdateStudent(Student student) {
		return studentDAO.save(student);
	}

	@Override
	public void deleteStudent(String login) {
		studentDAO.delete(login);
	}

	@Override
	public List<Student> findStudentsByGroup(String group) {
		return studentDAO.findStudentsByGroup(group);
	}

	@Override
	public List<Student> findAllStudentsByCourse(int course) {
		return studentDAO.findAllStudentsByCourse(course);
	}
}
