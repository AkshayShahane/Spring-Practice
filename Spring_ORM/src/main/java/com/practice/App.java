package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.Dao.StudentDao;
import com.practice.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	StudentDao bean = context.getBean("studentDaoImpl",StudentDao.class);
    
    	Student s = new Student(545,"Akshay","DP");
    	int r = bean.insert(s);
    	System.out.println("Record Inserted: "+r);
    }
}
