package com.practice.Dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.practice.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDaoImpl() {
		super();
	}

	@Override
	public String toString() {
		return "StudentDaoImpl [hibernateTemplate=" + hibernateTemplate + "]";
	}

	@Transactional
	public int insert(Student student) {
		Integer r = (Integer) this.hibernateTemplate.save(student);
		return r;
	}

}
