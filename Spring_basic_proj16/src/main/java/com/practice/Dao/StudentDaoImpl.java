package com.practice.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.entity.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public StudentDaoImpl() {
		super();
	}

	@Override
	public String toString() {
		return "StudentDaoImpl [jdbcTemplate=" + jdbcTemplate + "]";
	}

	public int update(Student student) {
		String query = "update student set name=? , city=? where id=?";
		int update = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return update;
	}

}
