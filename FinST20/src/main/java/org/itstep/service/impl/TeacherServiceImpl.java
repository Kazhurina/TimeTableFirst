package org.itstep.service.impl;

import org.itstep.dao.TeacherDAO;
import org.itstep.dao.pojo.Teacher;
import org.itstep.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	TeacherDAO teacherDAO;

	@Override
	public Teacher getTeacher(String login) {
		return teacherDAO.findOne(login);
	}

	@Override
	public Teacher createAndUpdateTeacher(Teacher teacher) {
		return teacherDAO.saveAndFlush(teacher);
	}

	@Override
	public void deleteTeacher(String login) {
		teacherDAO.delete(login);
		
	}
}
